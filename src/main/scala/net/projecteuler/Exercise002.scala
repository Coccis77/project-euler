package net.projecteuler

object Exercise002 {
  def solution(maxFibonacciValue: BigInt): BigInt = {
    Helper.fibonacci()
      .takeWhile(_ < maxFibonacciValue)
      .filter(_ % 2 == 0)
      .sum
  }
}
