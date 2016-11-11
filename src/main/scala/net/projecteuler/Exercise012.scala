package net.projecteuler

object Exercise012 {
  def solution(factorsNumber: BigInt): BigInt = {
    Helper.triangleNumber().dropWhile(Helper.factors(_).size < factorsNumber).head
  }
}
