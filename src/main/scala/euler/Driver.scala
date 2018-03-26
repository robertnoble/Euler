package euler

object Driver {
  import one_to_fifty._

  def main(args: Array[String]): Unit = {
    val answer = PythagoreanTriplet.calculate(1000)

    println(s"Answer = ${answer}")
  }
}
