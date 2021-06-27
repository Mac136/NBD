package com.nbd

object Task3 {
  def osobaPatternMatcher(osoba: Osoba): String = osoba match {
    case Osoba("Dave", nazwisko) => "Custom Hi message for Dave"
    case Osoba("Kate", nazwisko) => "Custom message for Kate"
    case Osoba(imie, "Smith") => "Hello Mr or Mrs Smith"
    case Osoba(imie, nazwisko) => s"Hi, $imie $nazwisko"
  }
}
