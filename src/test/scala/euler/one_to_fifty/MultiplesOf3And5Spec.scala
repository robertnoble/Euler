package euler.one_to_fifty

import org.scalatest._
import Matchers._
import MultiplesOf3And5.calculate

class MultiplesOf3And5Spec extends FunSpec {
  describe("MultiplesOf3And5") {
    it("should throw an exception on non-positive arguments") {
      intercept[IllegalArgumentException] {
        calculate(0)
      }

      intercept[IllegalArgumentException] {
        calculate(-5)
      }
    }

    it("should handle cases less than 3") {
      calculate(2) shouldBe 0
    }

    it("should handle cases greater than 2") {
      calculate(3) shouldBe 3
      calculate(5) shouldBe 8
      calculate(10) shouldBe 33
    }
  }
}
