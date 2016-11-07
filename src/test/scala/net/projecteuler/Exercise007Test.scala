package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise007Test extends FunSuite {
  test("Exercise007") {
    assertResult(104743) {
      Exercise007.solution(10001)
    }
  }

}
