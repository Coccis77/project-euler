package net.projecteuler

object Exercise009 {
  def solution(): BigInt = {
    val a = for (i <- 1 to 1000; j <- (1 to (1000 - i)).reverse if i < j; if j < 1000 - i - j)
      yield (i, j, 1000 - i - j)
        val tuple = a.filter(x => (x._1 * x._1) + (x._2 * x._2) == (x._3 * x._3)).head
    tuple._1 * tuple._2 * tuple._3

  }
}
