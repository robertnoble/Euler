package euler.one_to_fifty

import org.scalatest._
import Matchers._
import EvenFibonacciNumbers.calculate

class EvenFibonacciNumbersSpec extends FunSpec {
  describe("EvenFibonacciNumbers") {
    it("should throw an exception on non-positive arguments") {
      intercept[IllegalArgumentException] {
        calculate(0)
      }

      intercept[IllegalArgumentException] {
        calculate(-5)
      }
    }

    it("should handle the base cases (1 & 2)") {
      calculate(1) shouldBe 0
      calculate(2) shouldBe 2
    }

    it("should handle cases greater than 2") {
      calculate(5) shouldBe 2
      calculate(8) shouldBe 10
      calculate(35) shouldBe 44
    }
  }
}
