package com.nbd

import traits.{Nauczyciel, Pracownik, Student}

object Main extends App {
  def weekDays = List(
    "Poniedzialek",
    "Wtorek",
    "Sroda",
    "Czwartek",
    "Piatek",
    "Sobota",
    "Niedziela",
    "TestDay"
  )

  this.task1(weekDays)
  this.task2()
  this.task3()
  this.task4()
  this.task5()

  def task1(weekDays: List[String]): Unit = {
    println("-----Task-1-----")
    for(weekDay <- weekDays)
      println(Task1.weekDayStatus(weekDay))
  }

  def task2(): Unit = {
    println("-----Task-2-----")
    var kontoBankowe = new KontoBankowe()
    println(kontoBankowe.stanKonta)
    kontoBankowe.wplata(10)
    println(kontoBankowe.stanKonta)
    kontoBankowe.wyplata(5)
    println(kontoBankowe.stanKonta)
  }

  def task3(): Unit = {
    println("-----Task-3-----")
    var osoba1 = new Osoba("Dave", "Smith")
    var osoba2 = new Osoba("Kate", "Smith")
    var osoba3 = new Osoba("John", "Smith")
    var osoba4 = new Osoba("Test", "Name")
    println(Task3.osobaPatternMatcher(osoba1))
    println(Task3.osobaPatternMatcher(osoba2))
    println(Task3.osobaPatternMatcher(osoba3))
    println(Task3.osobaPatternMatcher(osoba4))
  }

  def task4(): Unit = {
    println("-----Task-4-----")
    var int = 5
    println(Task4.applyFunction(int, Task4.operation1))
    println(Task4.applyFunction(int, Task4.operation2))
    println(Task4.applyFunction(int, Task4.operation3))
    println(Task4.applyFunction(int, Task4.operation4))
  }

  def task5(): Unit = {
    println("-----Task-5-----")
    val student = new Osoba2("Dave", "Smith") with Student
    val pracownik = new Osoba2("Jane", "Smith") with Pracownik
    val nauczyciel = new Osoba2("Kyle", "Smith") with Nauczyciel
    val pracujacyStudent = new Osoba2("Kylie", "Smith") with Student with Pracownik
    val studjujacyPracownik = new Osoba2("Jane", "Doe") with Pracownik with Student

    println(student.podatek)
    println(pracownik.podatek)
    println(nauczyciel.podatek)
    println(pracujacyStudent.podatek)
    println(studjujacyPracownik.podatek)
  }
}
