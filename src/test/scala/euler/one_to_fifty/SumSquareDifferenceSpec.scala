package euler.one_to_fifty

import org.scalatest._
import Matchers._
import SumSquareDifference.calculate

class SumSquareDifferenceSpec extends FunSpec {
  describe("SumSquareDifference") {
    it("should throw an exception on non-positive arguments") {
      intercept[IllegalArgumentException] {
        calculate(0)
      }

      intercept[IllegalArgumentException] {
        calculate(-5)
      }
    }

    it("should handle some simple cases") {
      calculate(1) shouldBe 0
      calculate(2) shouldBe 4
      calculate(3) shouldBe 22
      calculate(10) shouldBe 2640
    }
  }
}
