package com.nbd
package traits

trait Nauczyciel extends Pracownik {
  override val podatek = 0.1 * pensja
}
