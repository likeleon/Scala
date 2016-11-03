import scala.io.StdIn

object Main {
  def main(args: Array[String]) = {
    val noun = StdIn.readLine("Enter a noun: ")
    val verb = StdIn.readLine("Enter a verb: ")
    val adj = StdIn.readLine("Enter an adjective: ")
    val adv = StdIn.readLine("Enter an adverb: ")
    println(s"Do you $verb your $adj $noun $adv? That's hilarious!")
  }
}
