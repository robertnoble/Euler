package euler

object Driver {
  import one_to_fifty._

  def main(args: Array[String]): Unit = {
    val answer = EvenFibonacciNumbers.calculate(4000000)

    println(s"Answer = ${answer}")
  }
}
