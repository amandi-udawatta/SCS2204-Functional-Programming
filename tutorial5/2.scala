object primeSeq {
  def checkPrime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2)
      return n == 2     //true of n=2 and false otherwise
    if (n % i == 0)
      return false
    if (i * i > n)
      return true
    checkPrime(n, i + 1)
  }

  def primeSeq(n: Int, num: Int = 2): Unit = {
    if (num < n) {
      if (checkPrime(num))
        print(num + " ")
      primeSeq(n, num + 1)
    }
  }
  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }

}
