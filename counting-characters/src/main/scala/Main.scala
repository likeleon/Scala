import scala.io.StdIn

object Main {
  def main(args: Array[String]) = {
    var str = StdIn.readLine("What is the input string? ")
    while (str.isEmpty) {
      str = StdIn.readLine("Type anything: ")
    }
    println(s"$str has ${str.size} characters.")
  }
}
