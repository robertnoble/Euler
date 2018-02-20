package euler.one_to_fifty

object LargestPrimeFactor {
  import euler.helpers.PrimeFactors.factorize

  def calculate(n : Long) : Long = {
    factorize(n).head
  }
}
