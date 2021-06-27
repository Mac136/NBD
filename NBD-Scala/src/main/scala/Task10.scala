package com.NBD

object Task10 extends Task {
  def filterMap(numbers: List[Int]): List[Int] = {
    numbers.filter(integer => {
      integer >= -5 && integer <= 12
    }).map(integer => integer.abs)
  }
}
