package com.NBD

object Task2 extends Task{
  def recurrency(weekDays: List[String]): String = {
    val stringBuilder = new StringBuilder
    if(weekDays.isEmpty)
      return ""
    else
      stringBuilder
        .append(weekDays.head)
        .append(",")
        .append(recurrency(weekDays.tail))
    this.trimComma(stringBuilder)
  }

  def reverseReccurency(weekDays: List[String]): String = {
    val stringBuilder = new StringBuilder
    if(weekDays.isEmpty)
      return ""
    else
      stringBuilder
        .insert(0, weekDays.head)
        .insert(0, ",")
        .insert(0, reverseReccurency(weekDays.tail))
    this.trimComma(stringBuilder)
  }
}
