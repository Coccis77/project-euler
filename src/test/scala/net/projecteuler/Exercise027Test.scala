package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise027Test extends FunSuite {
  test("Exercise027") {
    assertResult(-59231) {
      Exercise027.solution(999, 1000)
    }
  }
}
