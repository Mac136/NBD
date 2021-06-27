package com.NBD

object Task9 extends Task {
  def incrementByOne(numbers: List[Int]) : List[Int] = {
    numbers.map(integer => integer + 1)
  }
}
