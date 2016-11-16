package net.projecteuler

object Exercise021 {
  def solution(max: BigInt): BigInt = {
    Helper.bigIntStream(1, 1).takeWhile(_ < max)
      .filter {
        x => val amicableNumber = Helper.properDivisors(x).sum
          x != amicableNumber && x == Helper.properDivisors(amicableNumber).sum
      }.sum
  }
}
