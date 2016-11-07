package net.projecteuler

object Exercise005 {
  def solution(number: BigInt): BigInt = {
    if (number == 0) 1 else Helper.lcm(solution(number - 1), number)
  }
}
