package net.projecteuler

import java.io.InputStream

object Exercise013 {
  def solution(digitsNumber: Int): BigInt = {
    val stream : InputStream = getClass.getResourceAsStream("/Exercise013.txt")
    BigInt(scala.io.Source.fromInputStream(stream).getLines()
      .map(BigInt.apply)
      .sum
      .toString()
      .take(digitsNumber))
  }
}
