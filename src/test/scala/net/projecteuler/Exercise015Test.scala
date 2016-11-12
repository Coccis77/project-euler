package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise015Test extends FunSuite {
  test("Exercise015") {
    assertResult(BigInt("137846528820")) {
      Exercise015.solution(20)
    }
  }
}
