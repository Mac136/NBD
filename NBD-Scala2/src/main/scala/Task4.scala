package com.nbd

object Task4 {
  def applyFunction(int: Int, operation: Int => Int): Int = {
    operation(int)
  }

  def operation1(int: Int): Int = {
    int * int
  }

  def operation2(int: Int): Int = {
    int/int
  }

  def operation3(int: Int): Int = {
    int - 1
  }

  def operation4(int: Int): Int = {
    int + 1
  }
}
