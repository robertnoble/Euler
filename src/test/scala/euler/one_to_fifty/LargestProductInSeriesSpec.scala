package euler.one_to_fifty

import org.scalatest._
import Matchers._
import LargestProductInSeries.calculate

class LargestProductInSeriesSpec extends FunSpec {
  describe("LargestProductInSeries") {
    it("should throw an exception on bad arguments") {
      intercept[IllegalArgumentException] {
        calculate("123", 0)
      }

      intercept[IllegalArgumentException] {
        calculate("123", 4)
      }
    }

    it("should work with zeros") {
      calculate("1230456", 4) shouldBe 0
      calculate("0000", 1) shouldBe 0
    }

    it("should handle simple cases") {
      calculate("123998", 2) shouldBe 81
    }
  }
}
