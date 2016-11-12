package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise014Test extends FunSuite {
  test("Exercise014") {
    assertResult(837799) {
      Exercise014.solution(1000000)
    }
  }
}
