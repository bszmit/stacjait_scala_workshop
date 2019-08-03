package pl.bszmit.stacjait.solutions


object EX5 extends App {
  case class Book(title: String, publishYear: Int, translated: Boolean)

  class EBook(val title: String, val publishYear: Int, val translated: Boolean) { // SOLUTION 1
    override def equals(obj: Any): Boolean = { // SOLUTION 2
      val ebook = obj.asInstanceOf[EBook]
      title == ebook.title &&
      publishYear == ebook.publishYear &&
      translated == ebook.translated
    }

    def copy(title: String = this.title, publishYear: Int = this.publishYear, translated: Boolean = this.translated): EBook = // SOLUTION 3
      new EBook(title, publishYear, translated)

    override def toString: String = s"$title, $publishYear, $translated"
  }

  object EBook {
    def apply(title: String, publishYear: Int, translated: Boolean) = // SOLUTION 3
      new EBook(title, publishYear, translated)
  }

  val book = Book("Programming in Scala", 2008, false)
  val ebook = EBook("Learning Scala Programming", 2019, true)
  val book2 = Book("Programming in Scala", 2008, false)
  val ebook2 = EBook("Learning Scala Programming", 2019, true)
  println(book == book2)
  println(ebook == ebook2)

  book.title
  book.publishYear
  book.translated

  ebook.title
  ebook.publishYear
  ebook.translated

  val newBook = book.copy(publishYear = 2020)
  val newEbook = ebook.copy(publishYear = 2020)
  println(newBook)
  println(newEbook)

}
