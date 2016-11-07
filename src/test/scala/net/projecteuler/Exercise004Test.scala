package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise004Test extends FunSuite {
  test("Exercise004") {
    assertResult(906609) {
      Exercise004.solution()
    }
  }
}
