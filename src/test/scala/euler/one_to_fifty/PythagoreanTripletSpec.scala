package euler.one_to_fifty

import org.scalatest._
import Matchers._
import PythagoreanTriplet.calculate

class PythagoreanTripletSpec extends FunSpec {
  describe("PythagoreanTriplet") {
    it("should throw an exception on arguments less than 6") {
      intercept[IllegalArgumentException] {
        calculate(4)
      }
    }

    it("should return None for arguments for which there's no triplet") {
      calculate(6) shouldBe None
      calculate(13) shouldBe None
    }

    it("should find triplets in simple cases") {
      calculate(3 + 4 + 5) shouldBe Option((3, 4, 5))
      calculate(8 + 15 + 17) shouldBe Option((8, 15, 17))
    }
  }
}
