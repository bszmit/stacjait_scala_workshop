package pl.bszmit.stacjait.solutions

object EX8 extends App {
  val greater: (Int, Int) => Int = (x: Int, y: Int) => {
    if (x > y) x
    else y
  }

  println(greater(1, 3)) // 3
  println(greater(3, 1)) // 3
}
