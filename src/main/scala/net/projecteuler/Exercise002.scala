package net.projecteuler

object Exercise002 {
  def solution(maxFibonacciValue: BigInt): BigInt = {
    Helper.fibonacci()
      .takeWhile(x => x < maxFibonacciValue)
      .filter(y => y % 2 == 0)
      .sum
  }
}
