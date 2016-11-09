package net.projecteuler

import scala.collection.immutable.TreeSet

object Helper {

  def fibonacci(): Stream[Int] = fibonacci(1, 1)

  private def fibonacci(a: Int, b: Int): Stream[Int] = a #:: fibonacci(b, a + b)

  def bigIntStream(min: BigInt, step: BigInt): Stream[BigInt] = min #:: bigIntStream(min + step, step)

  def primes(): Stream[BigInt] = 2 #:: nextPrimes(3, TreeSet(2, 3))

  def isPrime(x: BigInt): Boolean = {
    primes().takeWhile(p => p * p <= x).forall(x % _ != 0)
  }

  private def nextPrimes(x: BigInt, previousPrimes: TreeSet[BigInt]): Stream[BigInt] = {
    val nextPrime: BigInt = bigIntStream(x + 2, 2).dropWhile(!isPrime(_, previousPrimes)).head
    x #:: nextPrimes(nextPrime, previousPrimes + nextPrime)
  }

  private def isPrime(x: BigInt, previousPrimes: TreeSet[BigInt]): Boolean = {
    previousPrimes.takeWhile(p => p * p <= x).forall(x % _ != 0)
  }

  def isPalindrome(n: BigInt): Boolean = {
    n.toString().reverse == n.toString()
  }

  def gcd(a: BigInt, b: BigInt): BigInt = if (b == 0) a.abs else gcd(b, a % b)

  def lcm(a: BigInt, b: BigInt): BigInt = (a * b).abs / gcd(a, b)


}
