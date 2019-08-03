package pl.bszmit.stacjait.solutions

object EX2 extends App {

  // Solution 1
  def isNegative(x: Double): Boolean = {
    x < 0
  }

  // Solution 2
  def abs(x: Double): Double = {
    if (isNegative(x)) {
      -x
    } else {
      x
    }
  }

  // Solution 3
  def max(x: Double, y: Double): Double = {
    if (x > y) {
      x
    } else {
      y
    }
  }

  // Solution 4
  def round(x: Double): Double = {
    val absX = abs(x)
    val rest = absX % 1
    val floor = absX - rest

    val result = if (rest >= 0.5) {
      floor + 1
    } else {
      floor
    }

    if (isNegative(x)) -result else result
  }

  List(
    abs(12),
    abs(-2),
    abs(0),
    max(1, 0),
    max(-11, 20),
    max(-11, -20),
    round(1.1),
    round(0.5),
    round(0.4),
    round(-0.4),
    round(-0.5),
    round(-1.1),
    round(-1.6),
  ).foreach(println)
}
