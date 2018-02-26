package euler.one_to_fifty

object LargestPrimeFactor {
  import euler.helpers.PrimeUtilities.factorize

  def calculate(n : Long) : Long = {
    factorize(n).head
  }
}
