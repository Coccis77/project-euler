package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise024Test extends FunSuite {
  test("Exercise024") {
    assertResult("2783915460") {
      Exercise024.solution("0123456789", 1000000)
    }
  }
}
