package euler.one_to_fifty

object LargestPalindromeProduct {
  def calculate() : Int = {
    var maxProduct = 1

    (999 to 100 by -1).foreach(x => (999 to x by -1).foreach( y => {
      val product = x * y
      if (product > maxProduct && isPalindrome(product))
        maxProduct = product
    }))

    maxProduct
  }

  private[one_to_fifty] def isPalindrome(n : Int) : Boolean = {
    val str = n.toString()
    val length = str.length()

    (0 to length / 2).forall( i => str.charAt(i) == str.charAt(length - i - 1))
  }

}
