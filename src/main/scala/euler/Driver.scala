package euler

object Driver {
  import one_to_fifty._

  def main(args: Array[String]): Unit = {
    val answer = SmallestMultiple.calculate(20L)

    println(s"Answer = ${answer}")
  }
}
