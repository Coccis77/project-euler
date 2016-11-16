package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise021Test extends FunSuite {
  test("Exercise021") {
    assertResult(31626) {
      Exercise021.solution(10000)
    }
  }
}
