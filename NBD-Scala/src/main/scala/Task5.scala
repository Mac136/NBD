package com.NBD

object Task5 extends Task{
  def transformMap(products: Map[String, Double]): Map[String,Double] = {
    products.transform( (K,V) => V * 0.9)
  }
}
