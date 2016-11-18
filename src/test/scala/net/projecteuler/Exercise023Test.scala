package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise023Test extends FunSuite {
  test("Exercise023") {
    assertResult(4179871) {
      Exercise023.solution()
    }
  }
}
