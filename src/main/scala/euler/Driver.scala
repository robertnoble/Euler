package euler

object Driver {
  import one_to_fifty._

  def main(args: Array[String]): Unit = {
    val answer = NthPrime.calculate(10001)

    println(s"Answer = ${answer}")
  }
}
