package net.projecteuler

object Exercise010 {
  def solution(max: BigInt): BigInt = {
    Helper.primes().takeWhile(_ < max).sum
  }
}
