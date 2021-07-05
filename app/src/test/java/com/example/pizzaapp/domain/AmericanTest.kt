package com.example.pizzaapp.domain

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class AmericanTest {

    @Test
    fun `Teigwerte` () {
        val sut = American(3, Groesse.KLEIN_24)

        Assertions.assertThat(sut.zutaten.size).isEqualTo(5)
        Assertions.assertThat(sut.zutaten[0].bezeichnung).isEqualTo("Mehl")
        Assertions.assertThat(sut.zutaten[0].prozent).isEqualTo(20.0)
        Assertions.assertThat(sut.zutaten[1].bezeichnung).isEqualTo("Wasser")
        Assertions.assertThat(sut.zutaten[1].prozent).isEqualTo(30.0)
        Assertions.assertThat(sut.zutaten[2].bezeichnung).isEqualTo("Salz")
        Assertions.assertThat(sut.zutaten[2].prozent).isEqualTo(10.0)
        Assertions.assertThat(sut.zutaten[3].bezeichnung).isEqualTo("Trockenhefe")
        Assertions.assertThat(sut.zutaten[3].prozent).isEqualTo(20.0)
        Assertions.assertThat(sut.zutaten[4].bezeichnung).isEqualTo("Olivenöl")
        Assertions.assertThat(sut.zutaten[4].prozent).isEqualTo(20.0)

    }

    @Test
    fun `Berechnung Gesamtteigmenge klein` () {
        val sut = American(1, Groesse.KLEIN_24)
        val gesamtteigmenge = sut.getGesamtteigmenge()
        Assertions.assertThat(gesamtteigmenge).isEqualTo(240.0)

    }

    @Test
    fun `Berechnung Gesamtteigmenge mittel` () {
        val sut = American(2, Groesse.MITTEL_28)
        val gesamtteigmenge = sut.getGesamtteigmenge()
        Assertions.assertThat(gesamtteigmenge).isEqualTo(560.0)

    }

    @Test
    fun `Berechnung Gesamtteigmenge gross` () {
        val sut = American(3, Groesse.GROSS_32)
        val gesamtteigmenge = sut.getGesamtteigmenge()
        Assertions.assertThat(gesamtteigmenge).isEqualTo(960.0)

    }

    @Test
    fun `Berechne Zutaten für American` () {
        val sut = American(4, Groesse.GROSS_32)
        val berechneteZutaten = sut.rezeptBerechnung()
        Assertions.assertThat(berechneteZutaten.size).isEqualTo(5)
        Assertions.assertThat(berechneteZutaten[0].bezeichnung).isEqualTo("Mehl")
        Assertions.assertThat(berechneteZutaten[0].zutatrundenzweistellen).isEqualTo(256.0)
        Assertions.assertThat(berechneteZutaten[1].bezeichnung).isEqualTo("Wasser")
        Assertions.assertThat(berechneteZutaten[1].zutatrundenzweistellen).isEqualTo(384.0)
        Assertions.assertThat(berechneteZutaten[2].bezeichnung).isEqualTo("Salz")
        Assertions.assertThat(berechneteZutaten[2].zutatrundenzweistellen).isEqualTo(128.0)
        Assertions.assertThat(berechneteZutaten[3].bezeichnung).isEqualTo("Trockenhefe")
        Assertions.assertThat(berechneteZutaten[3].zutatrundenzweistellen).isEqualTo(256.0)
        Assertions.assertThat(berechneteZutaten[4].bezeichnung).isEqualTo("Olivenöl")
        Assertions.assertThat(berechneteZutaten[4].zutatrundenzweistellen).isEqualTo(256.0)

    }
}

