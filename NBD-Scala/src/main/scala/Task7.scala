package com.NBD

object Task7 extends Task {
  def optionsExample(products: Map[String, Double], key: String): Option[Double] = {
    products.get(key)
  }
}
