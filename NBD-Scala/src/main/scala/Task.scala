package com.NBD

class Task {
  def trimComma(stringBuilder: StringBuilder): String = {
    if (stringBuilder.endsWith(",")) stringBuilder.deleteCharAt(stringBuilder.length() - 1)
    if (stringBuilder.startsWith(",")) stringBuilder.deleteCharAt(0)
    stringBuilder.toString()
  }
}
