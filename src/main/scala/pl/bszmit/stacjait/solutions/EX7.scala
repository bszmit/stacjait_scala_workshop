package pl.bszmit.stacjait.solutions

import scala.annotation.tailrec

object EX7 extends App {
  // solution 1
  def zeroInTheMiddle(xs: List[Int]): List[Int] = xs match {
    case e1 :: 0 :: e3 :: Nil => e1 :: e3 :: Nil
    case _                    => Nil
  }

  println(zeroInTheMiddle(List(1, 2, 3))) // Nil
  println(zeroInTheMiddle(List(1, 0, 3))) // List(1, 3)
  println(zeroInTheMiddle(List(1, 0, 3, 4))) // Nil
  println(isMonotonic(List(1, 2, 3))) // true

  // solution 2
  def isMonotonic(xs: List[Int]): Boolean = xs match {
    case e1 :: e2 :: e3 :: Nil if e1 >= e2 && e2 >= e3 => true
    case e1 :: e2 :: e3 :: Nil if e1 <= e2 && e2 <= e3 => true
    case _                                             => false
  }

  println(isMonotonic(List(1, 1, 3))) // true
  println(isMonotonic(List(2, 1, 3))) // false
  println(isMonotonic(List(3, 2, 1))) // true
  println(isMonotonic(List(3, 2, 1, 0))) // false

  // solution 3
  sealed trait Event
  case class MessageSent(sender: String, body: String) extends Event
  case class UserJoined(user: String) extends Event
  case class UserLeft(user: String) extends Event

  def handleEvent(ev: Event): String = ev match {
    case MessageSent(sender, body) => s"[$sender] $body"
    case UserJoined(user)          => s"# $user has joined"
    case UserLeft(user)            => s"# $user has left"
  }

  val userJoined = UserJoined("Alice")
  val msgSent = MessageSent("Alice", "Hi!")
  val userLeft = UserLeft("Alice")

  println(handleEvent(userJoined)) // # Alice has joined
  println(handleEvent(msgSent)) // [Alice] Hi!
  println(handleEvent(userLeft)) // # Alice has left


  // bonus - solution2 functional style without list length restriction
  def isRisingRec(xs: List[Int]): Boolean = {

    @tailrec
    def inner(x: Int, xs: List[Int]): Boolean = xs match {
      case e1 :: tail if x <= e1 => inner(e1, tail)
      case e1 :: tail => false
      case Nil => true
    }
    inner(xs.head, xs.tail)
  }

  println(isRisingRec(List(1, 2, 3, 4, 5, 6, 7, 8)))
  println(isRisingRec(List(1, 2, 3, 4, 5, 6, 9, 8)))
}
