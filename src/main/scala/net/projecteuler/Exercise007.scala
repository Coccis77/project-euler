package net.projecteuler

object Exercise007 {
  def solution(n: Int): BigInt = {
    Helper.primes().drop(n - 1).head
  }
}
