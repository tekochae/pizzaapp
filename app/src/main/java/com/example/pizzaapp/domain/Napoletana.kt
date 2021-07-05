package com.example.pizzaapp.domain

class Napoletana(anzahl: Int, groesse: Groesse): Pizzateig(anzahl, groesse) {
    val zutaten = arrayListOf<Zutat>()

    init {
        zutaten.add(Zutat("Mehl", 58.2))
        zutaten.add(Zutat("Wasser", 40.1))
        zutaten.add(Zutat("Salz", 1.6))
        zutaten.add(Zutat("Trockenhefe", 0.1))
    }

    override fun getZutaten(): List<Zutat> {
        return zutaten
    }
}