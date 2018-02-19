package euler.one_to_fifty

object MultiplesOf3And5 {
  // Returns the sum of multiples of 3 or 5 which are not higher than the upperBound
  def calculate(upperBound : Int) : Int = {
    (1 to upperBound)
      .filter( x => x % 3 == 0 || x % 5 == 0 )   // Filter down to multiples of 3 and 5
      .sum
  }
}
