package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise013Test extends FunSuite {
  test("Exercise013") {
    assertResult(BigInt("5537376230")) {
      Exercise013.solution(10)
    }
  }

}
