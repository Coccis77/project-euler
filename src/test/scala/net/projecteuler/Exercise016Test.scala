package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise016Test extends FunSuite {
  test("Exercise016") {
    assertResult(1366) {
      Exercise016.solution(2, 1000)
    }
  }
}
