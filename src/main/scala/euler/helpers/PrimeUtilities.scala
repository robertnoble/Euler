package euler.helpers

import scala.annotation.tailrec

object PrimeUtilities {
  private val oddPrimeStream : Stream[Long] = oddPrimeStream(3L)

  val primeStream : Stream[Long] = 2L #:: oddPrimeStream

  @tailrec
  def nextPrime(n : Long) : Long = {
    require(n % 2 != 0, "must be odd")

    val candidate = n + 2
    if (isPrime(candidate))
      candidate
    else
      nextPrime(candidate)
  }

  def isPrime(n : Long) : Boolean = {
    oddPrimeStream.takeWhile(x => x * x <= n).forall(n % _ != 0)
  }

  def oddPrimeStream(n : => Long) : Stream[Long] =
    n #:: oddPrimeStream(nextPrime(n))

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

    require(n > 0, "must be positive long")

    if (n < 2L)
      Nil
    else
      helper(n, 2L)
  }
}
