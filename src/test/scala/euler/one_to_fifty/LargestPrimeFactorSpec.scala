package euler.one_to_fifty

import org.scalatest._
import Matchers._
import LargestPrimeFactor.calculate

class LargestPrimeFactorSpec extends FunSpec {
  describe("LargestPrimeFactor") {
    it("should throw an exception on arguments less than 2") {
      intercept[IllegalArgumentException] {
        calculate(-5)
      }

      intercept[IllegalArgumentException] {
        calculate(1)
      }
    }

    it("should handle some simple cases") {
      calculate(2) shouldBe 2
      calculate(10) shouldBe 5
      calculate(100) shouldBe 5
      calculate(1300) shouldBe 13
    }
  }
}
