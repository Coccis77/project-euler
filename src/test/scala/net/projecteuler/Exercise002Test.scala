package net.projecteuler

import org.scalatest.FunSuite
import org.scalatest.Assertions._

class Exercise002Test extends FunSuite {
  test("Exercise002") {
    assertResult(4613732) {
      Exercise002.solution(4000000)
    }
  }
}
