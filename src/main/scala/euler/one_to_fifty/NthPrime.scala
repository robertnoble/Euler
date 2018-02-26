package euler.one_to_fifty

import euler.helpers.PrimeUtilities

object NthPrime {
  // Returns the nth prime number
  def calculate(n : Int) : Long = {
    require(n > 0)

    PrimeUtilities.primeStream(n - 1)
  }
}
