package com.example.pizzaapp.domain

class Swiss(anzahl: Int, groesse: Groesse): Pizzateig(anzahl, groesse) {
    val zutaten = arrayListOf<Zutat>()

    init {
        zutaten.add(Zutat("Mehl", 60.8))
        zutaten.add(Zutat("Wasser", 36.5))
        zutaten.add(Zutat("Salz", 1.8))
        zutaten.add(Zutat("Trockenhefe", 0.1))
        zutaten.add(Zutat("Olivenöl", 0.9))
    }

    override fun getZutaten(): List<Zutat> {
        return zutaten
    }
}