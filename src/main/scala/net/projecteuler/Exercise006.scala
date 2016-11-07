package net.projecteuler

object Exercise006 {
  def solution(number: BigInt): BigInt = {
    val squareOfSum = Helper.bigIntStream(1)
      .takeWhile(_ <= number)
      .sum.pow(2)

    val sumOfSquare = Helper.bigIntStream(1)
      .takeWhile(_ <= number)
      .map(x => x * x)
      .sum

    (sumOfSquare - squareOfSum).abs
  }
}
