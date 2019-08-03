package pl.bszmit.stacjait.solutions

object EX9 extends App {

  def composition[X, Y, Z](f: X => Y, g: Y => Z): X => Z = {
    (x: X) => g(f(x))
  }

  val stringLength = (s: String) => s.length
  val isGreaterThan5 = (x: Int) => x > 5

  val isStringLongerThan5 = composition[String, Int, Boolean](stringLength, isGreaterThan5)

  isStringLongerThan5("abc") // false
  isStringLongerThan5("abcdef") // true
  println(isStringLongerThan5("abc")) // false
  println(isStringLongerThan5("abcdef")) // true

}
