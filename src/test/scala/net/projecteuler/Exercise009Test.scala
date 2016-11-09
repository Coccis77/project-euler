package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise009Test extends FunSuite {
  test("Exercise009") {
    assertResult(31875000) {
      Exercise009.solution()
    }
  }
}
