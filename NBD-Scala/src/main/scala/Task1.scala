package com.NBD

object Task1 extends Task{
  def whileLoop(weekDays: List[String]): String = {
    val stringBuilder = new StringBuilder
    var i = 0
    while (i < weekDays.length) {
      stringBuilder
        .append(weekDays(i))
        .append(",")
      i += 1
    }
    val result = this.trimComma(stringBuilder)
    result
  }


  def forLoop(weekDays: List[String]): String = {
    val stringBuilder = new StringBuilder
    for(weekDay <- weekDays)
      stringBuilder
        .append(weekDay)
        .append(",")
    val result = this.trimComma(stringBuilder)
    result
  }

  def conditionalForLoop(weekDays: List[String]): String = {
    val stringBuilder = new StringBuilder
    for(weekDay <- weekDays) {
      if(weekDay.startsWith("P"))
        stringBuilder
          .append(weekDay)
          .append(",")
    }
    val result = this.trimComma(stringBuilder)
    result
  }
}
