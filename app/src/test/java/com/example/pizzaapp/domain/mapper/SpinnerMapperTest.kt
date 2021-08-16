package com.example.pizzaapp.domain.mapper

import com.example.pizzaapp.domain.American
import com.example.pizzaapp.domain.Groesse
import com.example.pizzaapp.domain.Napoletana
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class SpinnerMapperTest {
    @Test
    fun `Mappe Werte klein` () {
        val groesseMapper = groesseMapper("klein (28cm)")
        Assertions.assertThat(groesseMapper).isEqualTo(Groesse.KLEIN_24)

    }

    @Test
    fun `Mappe Werte mittel` () {
        val groesseMapper = groesseMapper("mittel (32cm)")
        Assertions.assertThat(groesseMapper).isEqualTo(Groesse.MITTEL_28)

    }

    @Test
    fun `Mappe Werte gross` () {
        val groesseMapper = groesseMapper("gross (40cm)")
        Assertions.assertThat(groesseMapper).isEqualTo(Groesse.GROSS_32)

    }

    @Test
    fun `Mappe ungültigen Wert` () {
        Assertions.assertThatThrownBy {groesseMapper("BingoBongo") } .hasMessage("Nicht supportete Grösse erhalten")

    }

    @Test
    fun `Mappe Anzahl 1` () {
        val anzahlMapper = anzahlMapper("1")
        Assertions.assertThat(anzahlMapper).isEqualTo(1)

    }

    @Test
    fun `Mappe Typ Napoletana` () {
        val typMapper = typMapper("Napoletana", 1, Groesse.KLEIN_24)
        Assertions.assertThat(typMapper).isInstanceOf(Napoletana::class.java)
        Assertions.assertThat(typMapper.anzahl).isEqualTo(1)
        Assertions.assertThat(typMapper.groesse).isEqualTo(Groesse.KLEIN_24)

    }

}