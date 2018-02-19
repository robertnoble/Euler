package euler

object Driver {
  import one_to_fifty._

  def main(args: Array[String]): Unit = {
    val answer = LargestPalindromeProduct.calculate()

    println(s"Answer = ${answer}")
  }
}
