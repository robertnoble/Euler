package euler.one_to_fifty

object EvenFibonacciNumbers {
  // Generates a stream of fibonacci numbers, starting with 1, 2, ...
  private val fibs: Stream[BigInt] = BigInt(1) #:: BigInt(2) #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)

  // Returns the sum of all even fibonacci numbers not higher than upperBound
  def calculate(upperBound : Int) : BigInt = {
    require(upperBound >= 1, "the number must be positive")

    fibs
      .takeWhile { _ <= upperBound }
      .filter { _ % 2 == 0 }
      .sum
  }
}
