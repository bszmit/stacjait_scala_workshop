package pl.bszmit.stacjait

object Hello extends App {
  // Solution 1
  def abs(x: Int): Int = {
    if (x < 0) {
      -x
    } else {
      x
    }
  }

  // Solution 2
  def max(x: Int, y: Int) = if (x > y) x else y

  // Solution 3
  def round(x: Double): Double = {
    val rest = x % 1
    val floor = x - rest

    if (rest >= 0.5) {
      floor + 1
    } else {
      floor
    }
  }
  // https://pastebin.com/Y0uJ7AC/a

}
