package com.nbd
package traits

trait Pracownik extends Osoba2 {
  var pensja: BigDecimal = 4000
  override val podatek = 0.20 * pensja
}
