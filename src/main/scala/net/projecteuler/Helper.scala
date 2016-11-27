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

  def intStream(min: Int, step: Int): Stream[Int] = min #:: intStream(min + step, step)

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
    if (x < 2) {
      false
    } else {
      primes().takeWhile(p => p * p <= x).forall(x % _ != 0)
    }
  }

  def collatzStream(x: BigInt): Stream[BigInt] = {
    def collatz(x: BigInt): BigInt = {
      if (x % 2 == 0) x / 2 else 3 * x + 1
    }

    val nextValue = if (x != 1) collatzStream(collatz(x)) else Stream.empty
    x #:: nextValue
  }

  def collatzLen(n: BigInt) = {
    def collatzLenAcc(n: BigInt, seqLen: BigInt): BigInt =
      if (n == 1) seqLen + 1
      else collatzLenAcc(
        if ((n & 1) == 0) n >> 1 else 3 * n + 1,
        seqLen + 1)
    collatzLenAcc(n, 0)
  }

  def isPalindrome(n: BigInt): Boolean = {
    n.toString().reverse == n.toString()
  }

  def factors(n: BigInt): TreeSet[BigInt] = {
    val divisors = bigIntStream(1, 1).takeWhile(p => p * p <= n)
      .filter(x => n % x == 0).to[TreeSet]
    divisors.++(divisors.map(n / _))
  }

  def properDivisors(n: BigInt): TreeSet[BigInt] = {
    factors(n) - n
  }

  def isAbundant(n: BigInt): Boolean = {
    properDivisors(n).sum > n
  }

  def gcd(a: BigInt, b: BigInt): BigInt = if (b == 0) a.abs else gcd(b, a % b)

  def lcm(a: BigInt, b: BigInt): BigInt = (a * b).abs / gcd(a, b)

  def factorial(n: BigInt): BigInt = {
    bigIntStream(1, 1).takeWhile(_ <= n).fold(BigInt(1))((acc, x) => acc * x)
  }

  def allPermutation(word: String): Array[String] = {
    def generatePermutation(char: Char, string: String): Array[String] = {
      (0 to string.length).map(string.splitAt(_))
        .map(x => x._1 + char + x._2).toArray
    }

    if (word.length == 1) {
      Array(word)
    } else {
      allPermutation(word.tail).flatMap(generatePermutation(word.head, _))
    }
  }
}
