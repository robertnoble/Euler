package euler.one_to_fifty

object LargestProductInSeries {
  def calculate(series : String, numDigits : Int) : Long = {
    require(numDigits > 0)
    require(series.length() >= numDigits, "Series was shorter than numDigits")

    val seriesOfLongs = series.toCharArray().map( Character.getNumericValue(_).toLong)
    seriesOfLongs.sliding(numDigits, 1).map( _.product).max
  }
}
