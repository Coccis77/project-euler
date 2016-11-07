package net.projecteuler

import org.scalatest.FunSuite
import org.scalatest.Assertions._

class Exercise001Test extends FunSuite {
  test("Exercise001") {
    assertResult(233168) {
      Exercise001.solution(1, 1000, 3, 5)
    }
  }

}
