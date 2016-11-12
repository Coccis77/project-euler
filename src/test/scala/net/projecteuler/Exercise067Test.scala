package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise067Test extends FunSuite {
  test("Exercise067") {
    assertResult(7273) {
      Exercise067.solution()
    }
  }
}
