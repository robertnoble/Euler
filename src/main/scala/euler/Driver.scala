package euler

object Driver {
  import one_to_fifty._

  def main(args: Array[String]): Unit = {


    val answer = LargestProductInSeries.calculate(LargestProductInSeries.series, 13)

    println(s"Answer = ${answer}")
  }
}
