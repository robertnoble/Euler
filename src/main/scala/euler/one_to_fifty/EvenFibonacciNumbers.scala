package euler.one_to_fifty

object EvenFibonacciNumbers {
  private val fibs: Stream[BigInt] = BigInt(1) #:: BigInt(2) #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)

  def calculate(upperBound : Int) : BigInt = {
    fibs takeWhile { _ <= upperBound } filter { _ % 2 == 0 } sum
  }
}
