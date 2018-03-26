package euler.one_to_fifty

import org.scalatest._
import Matchers._
import LargestPalindromeProduct.isPalindrome

class LargestPalindromeProductSpec extends FunSpec {
  describe("LargestPalindromeProduct") {
    it("should correctly test for palindromic ints") {
      isPalindrome(10) shouldBe false
      isPalindrome(101) shouldBe true
      isPalindrome(1) shouldBe true
      isPalindrome(11) shouldBe true
    }
  }
}
