package com.example.pizzaapp.domain

class Napoletana(anzahl: Int, groesse: Groesse): Pizzateig(anzahl, groesse) {
    val Zutaten = arrayListOf<Zutaten>()

    init {
        Zutaten.add(Zutaten("Mehl", 58.2))
        Zutaten.add(Zutaten("Wasser", 40.1))
        Zutaten.add(Zutaten("Salz", 1.6))
        Zutaten.add(Zutaten("Trockenhefe", 0.1))
    }

    override fun rezeptBerechnung(): List<Zutaten> {

        return listOf()
    }
}