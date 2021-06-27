package com.NBD

import scala.annotation.tailrec

object Task3 extends Task {
  @tailrec
  def tailReccurency(weekDays: List[String], stringBuilder: StringBuilder): String = {
    if(weekDays.isEmpty)
      return this.trimComma(stringBuilder)
    else
      stringBuilder
        .append(weekDays.head)
        .append(",")
    tailReccurency(weekDays.tail, stringBuilder)
  }
}
