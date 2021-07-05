package com.example.pizzaapp.domain

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class NapoletanaTest {

    @Test
    fun `Teigwerte` () {
        val sut = Napoletana(3, Groesse.KLEIN_24)

        Assertions.assertThat(sut.zutaten.size).isEqualTo(4)
        Assertions.assertThat(sut.zutaten[0].bezeichnung).isEqualTo("Mehl")
        Assertions.assertThat(sut.zutaten[0].prozent).isEqualTo(58.2)
        Assertions.assertThat(sut.zutaten[1].bezeichnung).isEqualTo("Wasser")
        Assertions.assertThat(sut.zutaten[1].prozent).isEqualTo(40.1)
        Assertions.assertThat(sut.zutaten[2].bezeichnung).isEqualTo("Salz")
        Assertions.assertThat(sut.zutaten[2].prozent).isEqualTo(1.6)
        Assertions.assertThat(sut.zutaten[3].bezeichnung).isEqualTo("Trockenhefe")
        Assertions.assertThat(sut.zutaten[3].prozent).isEqualTo(0.1)

    }

    @Test
    fun `Berechnung Gesamtteigmenge klein` () {
        val sut = Napoletana(2, Groesse.KLEIN_24)
        val gesamtteigmenge = sut.getGesamtteigmenge()
        Assertions.assertThat(gesamtteigmenge).isEqualTo(480.0)

    }

    @Test
    fun `Berechnung Gesamtteigmenge mittel` () {
        val sut = Napoletana(3, Groesse.MITTEL_28)
        val gesamtteigmenge = sut.getGesamtteigmenge()
        Assertions.assertThat(gesamtteigmenge).isEqualTo(840.0)

    }

    @Test
    fun `Berechnung Gesamtteigmenge gross` () {
        val sut = Napoletana(4, Groesse.GROSS_32)
        val gesamtteigmenge = sut.getGesamtteigmenge()
        Assertions.assertThat(gesamtteigmenge).isEqualTo(1280.0)

    }

    @Test
    fun `Berechne Zutaten für Napoletana` () {
        val sut = Napoletana(2, Groesse.KLEIN_24)
        val berechneteZutaten = sut.rezeptBerechnung()
        Assertions.assertThat(berechneteZutaten.size).isEqualTo(4)
        Assertions.assertThat(berechneteZutaten[0].bezeichnung).isEqualTo("Mehl")
        Assertions.assertThat(berechneteZutaten[0].zutatrundenzweistellen).isEqualTo(279.36)
        Assertions.assertThat(berechneteZutaten[1].bezeichnung).isEqualTo("Wasser")
        Assertions.assertThat(berechneteZutaten[1].zutatrundenzweistellen).isEqualTo(192.48)
        Assertions.assertThat(berechneteZutaten[2].bezeichnung).isEqualTo("Salz")
        Assertions.assertThat(berechneteZutaten[2].zutatrundenzweistellen).isEqualTo(7.68)
        Assertions.assertThat(berechneteZutaten[3].bezeichnung).isEqualTo("Trockenhefe")
        Assertions.assertThat(berechneteZutaten[3].zutatrundenzweistellen).isEqualTo(0.48)

    }
}

