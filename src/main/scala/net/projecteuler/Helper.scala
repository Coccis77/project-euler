package net.projecteuler

object Helper {

  def fibonacci(): Stream[Int] = fibonacci(1, 1)

  private def fibonacci(a: Int, b: Int): Stream[Int] = a #:: fibonacci(b, a + b)

  def bigIntStream(min: BigInt): Stream[BigInt] = min #:: bigIntStream(min + 1)

  def primes(): Stream[BigInt] = nextPrimes(2)

  private def nextPrimes(x: BigInt): Stream[BigInt] = {
    x #:: nextPrimes(bigIntStream(x + 1).dropWhile(!isPrime(_)).head)
  }

  def isPrime(x: BigInt): Boolean = {
    !bigIntStream(2).takeWhile(_ <= sqrt(x)).exists(x % _ == 0)
  }

  def sqrt(number: BigInt): BigInt = {
    def next(n: BigInt, i: BigInt): BigInt = (n + i / n) >> 1
    val one = BigInt(1)
    val n = one
    val n1 = next(n, number)
    def sqrtHelper(n: BigInt, n1: BigInt): BigInt = if ((n1 - n).abs <= one) List(n1, n).max else sqrtHelper(n1, next(n1, number))
    sqrtHelper(n, n1)
  }

  def isPalindrome(n: BigInt): Boolean = {
    n.toString().reverse == n.toString()
  }

  def gcd(a: BigInt, b: BigInt): BigInt = if (b==0) a.abs else gcd(b, a%b)

  def lcm(a: BigInt, b: BigInt): BigInt = (a*b).abs / gcd(a,b)


}
