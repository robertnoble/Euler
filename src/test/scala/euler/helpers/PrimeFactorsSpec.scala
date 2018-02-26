package euler.helpers

import org.scalatest._
import Matchers._
import PrimeFactors.factorize


class PrimeFactorsSpec extends FunSpec {
  describe("PrimeFactors") {
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
}
