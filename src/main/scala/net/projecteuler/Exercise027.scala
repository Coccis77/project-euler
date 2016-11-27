package net.projecteuler

object Exercise027 {
  def solution(maxA: Int, maxB : Int): BigInt = {
    def operation(tuple: (Int, Int))(x: Int) = {
      x * x + tuple._1 * x + tuple._2
    }
    def maxPrime(operation: (Int) => Int): Int = {
      Helper.intStream(0, 1)
        .takeWhile(x => Helper.isPrime(operation(x)))
        .lastOption
        .getOrElse(0)
    }
    val tuples = for (a <- (-maxA) to maxA; b <- 0 to maxB) yield (a, b)
    tuples
      .map(x => (x._1 * x._2, maxPrime(operation(x))))
      .reduce((x, y) => if (x._2 > y._2) x else y)
      ._1
  }
}
