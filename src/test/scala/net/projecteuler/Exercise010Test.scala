package net.projecteuler

import org.scalatest.Assertions._
import org.scalatest.FunSuite

class Exercise010Test extends FunSuite {
  test("Exercise010") {
    assertResult(BigInt("142913828922")) {
      Exercise010.solution(2000000)
    }
  }

}
