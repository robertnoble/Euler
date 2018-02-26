package euler.one_to_fifty

object SmallestMultiple {
  type FactorMap = Map[Long, Int]

  // Find smallest multiple evenly divisible by all numbers from 1 to n
  def calculate(n : Long) : Long = {
    val range = 2L to n
    val factorMapList = range.map( factorMap(_) )
    val minimizedMap = factorMapList.fold(Map.empty[Long, Int])(unionFactors(_, _))
    minimizedMap.map({case (k, v) => math.pow(k, v).toLong}).product
  }

  private def factorMap(n : Long) : FactorMap = {
    import euler.helpers.PrimeFactors

    PrimeFactors.factorize(n).groupBy( x => x ).mapValues(x => x.size)
  }


  private def unionFactors(l : FactorMap, r : FactorMap) : FactorMap = {
     l.keySet.union(r.keySet).map(x => x -> List(l.get(x),r.get(x)).flatten.max).toMap
  }
}
