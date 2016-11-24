package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise025Test extends FunSuite {
  test("Exercise025") {
    assertResult(4782) {
      Exercise025.solution(1000)
    }
  }
}
