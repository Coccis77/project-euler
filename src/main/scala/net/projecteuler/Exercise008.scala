package net.projecteuler

object Exercise008 {
  def solution(number: BigInt, digitNumber: Int): BigInt = {
    val numberAsString = number.toString()
    val digitLists = for (i <- 0 to numberAsString.length - digitNumber)
      yield for (j <- 0 until digitNumber)
        yield numberAsString.charAt(i + j).asDigit : BigInt
    digitLists.map(_.product).max
  }
}
