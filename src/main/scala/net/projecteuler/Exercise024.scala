package net.projecteuler

object Exercise024 {
  def solution(word: String, n: Int): String = {
    Helper.allPermutation(word).sortWith(_ < _)(n - 1)
  }
}
