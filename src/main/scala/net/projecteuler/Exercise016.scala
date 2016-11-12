package net.projecteuler

object Exercise016 {
  def solution(n: BigInt, power: Int): BigInt = {
    n.pow(power).toString().map(_.asDigit).sum
  }
}
