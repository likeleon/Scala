import scala.io.StdIn

object Main {
  def main(args: Array[String]) = {
    val name = StdIn.readLine("What is your name? ")
    println(s"Hello, $name, nice to meet you!")
  }
}
