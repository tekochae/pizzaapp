package com.example.pizzaapp.domain

abstract class Pizzateig(val anzahl: Int, val groesse: Groesse) {
    //fun getRezept()
    fun getGesamtteigmenge(): Double {
        return anzahl.toDouble() * groesse.gramm.toDouble()
    }

    abstract fun rezeptBerechnung(): List<Zutaten>

}

enum class Groesse(val gramm: Int) {
    KLEIN_24(240), MITTEL_28(280), GROSS_32(320)
}