package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise012Test extends FunSuite {
  test("Exercise012") {
    assertResult(76576500) {
      Exercise012.solution(500)
    }
  }

}
