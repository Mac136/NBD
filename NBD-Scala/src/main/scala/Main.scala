package com.NBD

import scala.collection.mutable.ListBuffer

object Main extends App {

  val weekDays = List(
    "Poniedzialek",
    "Wtorek",
    "Sroda",
    "Czwartek",
    "Piatek",
    "Sobota",
    "Niedziela"
  )
  this.task1(weekDays)
  this.task2(weekDays)
  this.task3(weekDays)
  this.task4(weekDays)

  def productMap = Map(
    "Mleko" -> 2.99,
    "CocaCola" -> 4.50,
    "Chipsy" -> 6.50,
    "Czekolada" -> 4.50
  )

  this.task5(productMap)
  this.task6()
  this.task7(productMap)

  def numbers = List(
    -12,0,-11,0,0,-10,-9,-8,0,-7,-6,-5,-4,0,0,0,-3,-2,-1,0,1,2,3,4,5,0,6,7,0,8,0,0,0,9,0,10,0,0,11,0,0,0,0,0,0,12,13,14,15,16,17,18,19,20
  )

  this.task8(numbers)
  this.task9(numbers)
  this.task10(numbers)

  def task1(weekDays: List[String]): Unit = {
    println("-----Task-1-----")
    println(Task1.forLoop(weekDays))
    println(Task1.conditionalForLoop(weekDays))
    println(Task1.whileLoop(weekDays))
  }

  def task2(weekDays: List[String]): Unit = {
    println("-----Task-2-----")
    println(Task2.recurrency(weekDays))
    println(Task2.reverseReccurency(weekDays))
  }

  def task3(weekDays: List[String]): Unit = {
    println("-----Task-3-----")
    println(Task3.tailReccurency(weekDays, new StringBuilder))
  }

  def task4(weekDays: List[String]): Unit = {
    println("-----Task-4-----")
    println(Task4.useFoldL(weekDays))
    println(Task4.useFoldR(weekDays))
    println(Task4.useConditionalFoldL(weekDays))
  }

  def task5(products: Map[String, Double]): Unit = {
    println("-----Task-5-----")
    println(Task5.transformMap(products))
  }

  def task6(): Unit = {
    println("-----Task-6-----")
    Task6.printTuple("Test", 1, 22.5)
  }

  def task7(products: Map[String, Double]): Unit = {
    println("-----Task-7-----")
    println(Task7.optionsExample(products, "Mleko"))
    println(Task7.optionsExample(products, "Frytki"))
  }

  def task8(numbers: List[Int]): Unit = {
    println("-----Task-8-----")
    println(Task8.removeZeroes(numbers, ListBuffer()))
  }

  def task9(numbers: List[Int]): Unit = {
    println("-----Task-9-----")
    println(Task9.incrementByOne(numbers))
  }

  def task10(numbers: List[Int]): Unit = {
    println("-----Task-10-----")
    println(Task10.filterMap(numbers))
  }
}
