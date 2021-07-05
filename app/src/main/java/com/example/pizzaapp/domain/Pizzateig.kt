package com.example.pizzaapp.domain

abstract class Pizzateig(val anzahl: Int, val groesse: Groesse) {

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
    abstract fun getZutaten(): List<Zutat>

}

enum class Groesse(val gramm: Int) {
    KLEIN_24(240), MITTEL_28(280), GROSS_32(320)
}
