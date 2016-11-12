package net.projecteuler

object Exercise014 {
  def solution(max: BigInt): BigInt = {
    Helper.bigIntStream(3, 2)
      .takeWhile(_ < max)
      .maxBy(Helper.collatzLen)
  }
}
