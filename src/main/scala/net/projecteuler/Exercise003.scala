package net.projecteuler

object Exercise003 {
  def solution(number: BigInt): BigInt = {
    Helper.primes()
      .takeWhile(p => p * p <= number)
      .filter(number % _ == 0).max
  }
}
