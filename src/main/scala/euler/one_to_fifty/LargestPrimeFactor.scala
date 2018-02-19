package euler.one_to_fifty

object LargestPrimeFactor {
  import scala.math._

  def calculate(n : Long) : Long = {
    var largestFound = 1L
    var factored = n
    var maxFactor = sqrt(factored).toLong
    var currentFactor = 3L

    // Remove all factors of 2
    while (factored % 2 == 0) {
      largestFound = 2L
      factored /= 2
      maxFactor = sqrt(factored).toLong
    }

    while (currentFactor <= maxFactor) {
      if (factored % currentFactor == 0) {
        factored /= currentFactor
        maxFactor = sqrt(factored).toLong
        largestFound = currentFactor
      }
      else
        currentFactor += 2
    }

    max(largestFound, factored)
  }
}
