package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise018Test extends FunSuite {
  test("Exercise018") {
    assertResult(1074) {
      Exercise018.solution()
    }
  }
}
