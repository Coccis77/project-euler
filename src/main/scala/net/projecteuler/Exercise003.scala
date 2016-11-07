package net.projecteuler

object Exercise003 {
  def solution(number: BigInt): BigInt = {
    // Get a Set of the divisor lesser than the square root
    val divisors: Set[BigInt] = Helper.bigIntStream(1)
      .takeWhile(_ <= Helper.sqrt(number))
      .filter(number % _ == 0).toSet

    divisors.++(divisors.map(number / _)).filter(Helper.isPrime).max
  }
}
