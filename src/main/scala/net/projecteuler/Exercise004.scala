package net.projecteuler

object Exercise004 {
  def solution(): BigInt = {
    val multiplication = for (i <- List.range(100, 1000); j <- List.range(100, 1000)) yield i * j
    multiplication.filter(Helper.isPalindrome(_)).max
  }
}
