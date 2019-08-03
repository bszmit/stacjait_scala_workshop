package pl.bszmit.stacjait.solutions

object EX4 extends App {

  class Bucket private (private val capacity: Double)

  object Bucket {
    def createEmpty: Bucket = new Bucket(0)

    def create(capacity: Double): Bucket = new Bucket(capacity)

    def compare(b1: Bucket, b2: Bucket): Boolean =
      b1.capacity == b2.capacity
  }

  val b1 = Bucket.createEmpty
  val b2 = Bucket.create(10)
  val b3 = Bucket.create(0)
  List(Bucket.compare(b1, b2), Bucket.compare(b1, b3)).foreach(println)
}
