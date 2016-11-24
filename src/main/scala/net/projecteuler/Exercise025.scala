package net.projecteuler

object Exercise025 {
  def solution(numberOfDigits: BigInt): BigInt = {
    Helper.fibonacci().takeWhile(_.toString().length < numberOfDigits).zipWithIndex
      .last._2 + 2
  }
}
