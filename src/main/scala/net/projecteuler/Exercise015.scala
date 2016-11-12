package net.projecteuler

object Exercise015 {
  def solution(gridLength: BigInt): BigInt = {
    Helper.factorial(gridLength * 2) / (Helper.factorial(gridLength) * Helper.factorial(gridLength))
  }
}
