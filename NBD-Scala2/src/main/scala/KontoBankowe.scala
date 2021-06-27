package com.nbd

class KontoBankowe(private var _stanKonta: BigDecimal) {

  def stanKonta: BigDecimal = _stanKonta

  def this(){
    this(BigDecimal.apply(0))
  }

  def wplata(ilosc: BigDecimal): Unit ={
    _stanKonta+=ilosc
  }

  def wyplata(ilosc: BigDecimal): Unit ={
    _stanKonta-=ilosc
  }
}
