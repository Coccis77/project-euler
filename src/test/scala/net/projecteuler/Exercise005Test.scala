package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise005Test extends FunSuite {
  test("Exercise005") {
    assertResult(232792560) {
      Exercise005.solution(20)
    }
  }
}
