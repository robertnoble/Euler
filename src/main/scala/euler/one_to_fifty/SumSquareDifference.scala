package euler.one_to_fifty

object SumSquareDifference {
  def calculate(n : Int) : Long = {
    require(n > 0, "argument must be positive int")

    val sumOfSquares = (1L to n.toLong).map(x => x * x).sum
    val sumOfN = n.toLong * (n + 1) / 2

    sumOfN * sumOfN - sumOfSquares
  }
}
