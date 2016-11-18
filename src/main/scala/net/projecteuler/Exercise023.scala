package net.projecteuler

object Exercise023 {
  def solution(): BigInt = {
    val stream = Helper.bigIntStream(1, 1)
      .takeWhile(_ < 28123)

    val abundantNumbers = stream.filter(Helper.isAbundant).toSet

    stream.filter(x => !abundantNumbers.exists(y => abundantNumbers.contains(x - y))).sum
  }
}
