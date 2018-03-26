package euler.one_to_fifty

object PythagoreanTriplet {
  def calculate(sum : Int) : Option[(Int, Int, Int)] = {
    require(sum >= 6, "Smallest legal argument is 6")

    val maxC = sum - 3
    val minC = sum / 3 + (if (sum % 3 == 0) 1 else 2)

    (
      for {
        c <- minC to maxC
        rest = sum - c
        cSquared = c * c
        b <- rest / 2 + 1 to c-1
        a = rest - b
        if (a * a + b * b) == cSquared
      } yield (a, b, c)
    ).headOption
  }
}
