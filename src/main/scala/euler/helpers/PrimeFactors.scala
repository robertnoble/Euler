package euler.helpers

import scala.annotation.tailrec

object PrimeFactors {
  def factorize(n : Long) : List[Long] = {

    @tailrec
    def helper(n : Long, factor : Long, list : List[Long] = Nil) : List[Long] = {
      if (factor * factor > n)
        n :: list
      else if (n % factor == 0)
        helper(n / factor, factor, factor :: list)
      else
        helper(n, if (factor == 2L) 3L else factor + 2, list)
    }

    helper(n, 2L)
  }
}
