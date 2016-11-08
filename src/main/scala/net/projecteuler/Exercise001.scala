package net.projecteuler

object Exercise001 {
  def solution(rangeFrom: BigInt, rangeToExclude: BigInt, multiple: BigInt*): BigInt = {
    (rangeFrom until rangeToExclude).filter(x => multiple.exists(x % _ == 0)).sum
  }
}
