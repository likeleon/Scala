import scala.io.StdIn

object Main {
  def main(args: Array[String]) = {
    val quote = StdIn.readLine("What is the quote? ")
    val author = StdIn.readLine("Who said it? ")
    println(author + " says, \"" + quote + "\"")
  }
}
