package euler.helpers

import org.scalatest._
import Matchers._

class PrimeUtilitiesSpec extends FunSpec {
  describe("factorize") {
    import PrimeUtilities.factorize

    it("should throw an exception on non-positive arguments") {
      intercept[IllegalArgumentException] {
        factorize(0)
      }

      intercept[IllegalArgumentException] {
        factorize(-5)
      }
    }

    it("should handle 1 specially") {
      factorize(1) shouldBe Nil
    }

    it("should handle some simple cases") {
      factorize(2) shouldBe List(2)
      factorize(4) shouldBe List(2, 2)
      factorize(6) shouldBe List(3, 2)
      factorize(1300) shouldBe List(13, 5, 5, 2, 2)
    }
  }

  describe("primeStream") {
    import PrimeUtilities.primeStream

    it("should start with 2 and include the primes in sequence after that") {
      primeStream.take(10).toList shouldBe List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
    }
  }
}
