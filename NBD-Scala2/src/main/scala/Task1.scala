package com.nbd

object Task1 {
  def weekDayStatus(weekDay: String): String = weekDay match {
    case "Poniedzialek" => "Praca"
    case "Wtorek" => "Praca"
    case "Sroda" => "Praca"
    case "Czwartek" => "Praca"
    case "Piatek" => "Praca"
    case "Sobota" => "Weekend"
    case "Niedziela" => "Weekend"
    case default => "Nie ma takiego dnia"
  }
}
