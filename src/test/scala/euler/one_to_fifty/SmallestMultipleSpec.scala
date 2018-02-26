package euler.one_to_fifty

import org.scalatest._
import Matchers._
import SmallestMultiple.calculate

class SmallestMultipleSpec extends FunSpec {
  describe("SmallestMultiple") {
    it("should throw an exception on non-positive arguments") {
      intercept[IllegalArgumentException] {
        calculate(0)
      }

      intercept[IllegalArgumentException] {
        calculate(-5)
      }
    }

    it("should handle some simple cases") {
      calculate(1) shouldBe 1
      calculate(2) shouldBe 2
      calculate(4) shouldBe 12
      calculate(10) shouldBe 2520
    }
  }
}
