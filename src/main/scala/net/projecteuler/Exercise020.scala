package net.projecteuler

object Exercise020 {
  def solution(n: BigInt): BigInt = {
    Helper.factorial(n).toString().map(_.asDigit).sum
  }
}
