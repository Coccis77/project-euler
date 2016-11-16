package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise020Test extends FunSuite {
  test("Exercise020") {
    assertResult(648) {
      Exercise020.solution(100)
    }
  }
}
