package com.NBD

object Task4 extends Task {
  def useFoldL(weekDays: List[String]): String = {
    weekDays.tail.foldLeft(weekDays.head)(_ + "," + _)
  }

  def useFoldR(weekDays: List[String]): String = {
    weekDays.take(weekDays.length - 1).foldRight(weekDays(weekDays.length - 1))(_ + "," + _)
  }

  def useConditionalFoldL(weekDays: List[String]): String = {
    weekDays.tail.foldLeft(weekDays.head) { (weekDaysString, weekDay) =>
      if(weekDay.startsWith("P"))
        weekDaysString + "," + weekDay
      else
        weekDaysString
    }
  }
}
