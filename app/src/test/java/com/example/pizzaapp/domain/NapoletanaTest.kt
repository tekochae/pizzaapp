package com.example.pizzaapp.domain

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class NapoletanaTest {

    @Test
    fun `Teigwerte` () {
        val sut = Napoletana(3, Groesse.KLEIN_24)

        Assertions.assertThat(sut.Zutaten.size).isEqualTo(4)
        Assertions.assertThat(sut.Zutaten[0].bezeichnung).isEqualTo("Mehl")
        Assertions.assertThat(sut.Zutaten[0].prozent).isEqualTo(58.2)
        Assertions.assertThat(sut.Zutaten[1].bezeichnung).isEqualTo("Wasser")
        Assertions.assertThat(sut.Zutaten[1].prozent).isEqualTo(40.1)
        Assertions.assertThat(sut.Zutaten[2].bezeichnung).isEqualTo("Salz")
        Assertions.assertThat(sut.Zutaten[2].prozent).isEqualTo(1.6)
        Assertions.assertThat(sut.Zutaten[3].bezeichnung).isEqualTo("Trockenhefe")
        Assertions.assertThat(sut.Zutaten[3].prozent).isEqualTo(0.1)

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
    fun `Berechne Rezept` () {
        val sut = Napoletana(2, Groesse.KLEIN_24)
        val berechneteZutaten = sut.rezeptBerechnung()
        val gesamtteigmenge = sut.getGesamtteigmenge()
        Assertions.assertThat(berechneteZutaten[0].bezeichnung).isEqualTo("Mehl")
        Assertions.assertThat(berechneteZutaten[0].prozent).isEqualTo(58.2)
        Assertions.assertThat(gesamtteigmenge).isEqualTo(480.0)
        Assertions.assertThat(berechneteZutaten).isEqualTo(279.36)

    }
}

//Zutaten Test, eigener erstellen
//@Test
//fun `napoletana werte anziehen` () {
    //val sut = Zutaten("Mehl", 58.2)

    //Assertions.assertThat(sut.bezeichnung).isEqualTo("Mehl")
    //Assertions.assertThat(sut.prozent).isEqualTo(58.2)

//}