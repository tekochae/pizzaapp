package com.example.pizzaapp.domain

import java.io.Serializable

abstract class Pizzateig(val anzahl: Int, val groesse: Groesse) : Serializable {

    fun getGesamtteigmenge(): Double {
        return anzahl.toDouble() * groesse.gramm.toDouble()
    }

    fun rezeptBerechnung(): List<BerechneteZutat> {
        val berechneteZutat = mutableListOf<BerechneteZutat>()
        for(zutat in getZutaten()){
            berechneteZutat.add(BerechneteZutat(zutat.bezeichnung, getGesamtteigmenge()*zutat.prozentberechnungzutat))
        }
        return berechneteZutat
    }

    fun anzeigeBerechnung(): String {
        return rezeptBerechnung().joinToString("\n") { "${it.bezeichnung}:\t\t${it.zutatrundenzweistellen}"}
    }


    abstract fun getZutaten(): List<Zutat>

}

enum class Groesse(val gramm: Int) {
    KLEIN_24(240), MITTEL_28(280), GROSS_32(320)
}
