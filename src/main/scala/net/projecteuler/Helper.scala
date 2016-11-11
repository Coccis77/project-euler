package net.projecteuler

import scala.collection.immutable.TreeSet

object Helper {

  def fibonacci(): Stream[BigInt] = {
    def fibonacci(a: BigInt, b: BigInt): Stream[BigInt] = a #:: fibonacci(b, a + b)
    fibonacci(1, 1)
  }

  def triangleNumber(): Stream[BigInt] = {
    def triangleNumber(x: BigInt, y: BigInt): Stream[BigInt] = x #:: triangleNumber(x + y, y + 1)
    triangleNumber(1, 2)
  }

  def bigIntStream(min: BigInt, step: BigInt): Stream[BigInt] = min #:: bigIntStream(min + step, step)

  def primes(): Stream[BigInt] = {
    def nextPrimes(x: BigInt, previousPrimes: TreeSet[BigInt]): Stream[BigInt] = {
      def isPrime(x: BigInt, previousPrimes: TreeSet[BigInt]): Boolean = {
        previousPrimes.takeWhile(p => p * p <= x).forall(x % _ != 0)
      }

      val nextPrime: BigInt = bigIntStream(x + 2, 2).dropWhile(!isPrime(_, previousPrimes)).head
      x #:: nextPrimes(nextPrime, previousPrimes + nextPrime)
    }

    2 #:: nextPrimes(3, TreeSet(2, 3))
  }

  def isPrime(x: BigInt): Boolean = {
    primes().takeWhile(p => p * p <= x).forall(x % _ != 0)
  }


  def isPalindrome(n: BigInt): Boolean = {
    n.toString().reverse == n.toString()
  }

  def factors(n: BigInt): TreeSet[BigInt] = {
    val divisors = bigIntStream(1, 1).takeWhile(p => p * p <= n)
      .filter(x => n % x == 0).to[TreeSet]
    divisors.++(divisors.map(n / _))
  }

  def gcd(a: BigInt, b: BigInt): BigInt = if (b == 0) a.abs else gcd(b, a % b)

  def lcm(a: BigInt, b: BigInt): BigInt = (a * b).abs / gcd(a, b)


}
