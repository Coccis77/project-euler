package net.projecteuler

import org.scalatest.FunSuite
import org.scalatest.Assertions._

class Exercise003Test extends FunSuite {
  test("Exercise003") {
    assertResult(6857) {
      Exercise003.solution(600851475143L)
    }
  }

}
