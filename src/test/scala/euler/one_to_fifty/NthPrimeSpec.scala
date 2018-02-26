package euler.one_to_fifty

import org.scalatest._
import Matchers._
import NthPrime.calculate

class NthPrimeSpec extends FunSpec {
  describe("NthPrime") {
    it("should throw an exception on non-positive arguments") {
      intercept[IllegalArgumentException] {
        calculate(0)
      }

      intercept[IllegalArgumentException] {
        calculate(-5)
      }
    }

    it("should handle simple cases") {
      calculate(1) shouldBe 2
      calculate(10) shouldBe 29
    }
  }
}
