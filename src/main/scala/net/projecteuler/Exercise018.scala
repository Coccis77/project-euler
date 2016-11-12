package net.projecteuler

import java.io.InputStream

object Exercise018 {
  def solution(): BigInt = {
    solution("Exercise018.txt")
  }
  
  def solution(file: String): BigInt = {
    val stream : InputStream = getClass.getResourceAsStream("/" + file)
    val valuesArray = scala.io.Source.fromInputStream(stream).getLines()
      .map(_.split(" ").map(BigInt.apply))
      .toArray

    def solution(values: Array[BigInt]): BigInt = {
      if (values.length == 1) {
        values(0)
      } else {
        val nextArray = valuesArray(values.length - 2).zipWithIndex
        solution(
          nextArray.map(x => if (x._2 == values.length) x._1
          else x._1 + values(x._2).max(values(x._2 + 1)))
        )
      }
    }

    solution(valuesArray.last)
  }
}
