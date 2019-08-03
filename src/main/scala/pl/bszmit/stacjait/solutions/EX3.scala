package pl.bszmit.stacjait.solutions

object EX3 extends App {

  trait Animal {
    def move(): Unit = println("walking")
    val sound: String
    def speak(): Unit = println(sound)
  }

  class Dog extends Animal {
    override val sound: String = "woof"
  }

  class Bird extends Animal {
    override def move(): Unit = println("flying")
    override val sound: String = "tweet"
  }

  class Fish extends Animal {
    override def move(): Unit = println("swimming")
    override val sound: String = "bulb"
  }

  val animal1: Animal = new Dog()
  val animal2: Animal = new Bird()
  val animal3: Animal = new Fish()


  val a: List[Animal] = List(
    new Dog(),
    new Bird(),
    new Fish()
  )

  animal1.move()
  animal2.move()
  animal3.move()

  animal1.speak()
  animal2.speak()
  animal3.speak()
}
