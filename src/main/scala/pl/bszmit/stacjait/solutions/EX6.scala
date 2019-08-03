package pl.bszmit.stacjait.solutions

object EX6 extends App {
  // SOLUTION 1
  def getThirdElement[T](l: List[T]): T = {
    l.tail.tail.head
  }

  println(getThirdElement(List("a", "b", "c", "d")))

  // SOLUTION 2
  def concatSquaresAndAbsolutes(xs1: List[Int], xs2: List[Int]): List[Int] = {
    val squared = for (x <- xs1) yield (x*x)
    val absoluted = for (x <- xs2) yield {
      if (x >= 0) x
      else -x
    }

    squared ::: absoluted
  }

  println(concatSquaresAndAbsolutes(List(1, 2, 3), List(-44, 0, 15)))

  // SOLUTION 3
  def getFirstAsList[T](participants: List[T]): List[T] = {
    participants.head :: Nil
  }

  println(getFirstAsList(List(false, true, true)))
}
