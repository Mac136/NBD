package com.NBD

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object Task8 extends Task {
  @tailrec
  def removeZeroes(numbers: List[Int], result: ListBuffer[Int]): List[Int] = {
    if(numbers.isEmpty)
      return result.toList
    if (numbers.head != 0)
      result.addOne(numbers.head)
    this.removeZeroes(numbers.tail, result)
  }
}
