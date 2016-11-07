package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise006Test extends FunSuite {
  test("Exercise006") {
    assertResult(25164150) {
      Exercise006.solution(100)
    }
  }

}
