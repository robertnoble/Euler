package euler.one_to_fifty

object MultiplesOf3And5 {
  def calculate(upperBound : Int) : Int = {
    (1 to upperBound).filter( x => x % 3 == 0 || x % 5 == 0).sum
  }
}
