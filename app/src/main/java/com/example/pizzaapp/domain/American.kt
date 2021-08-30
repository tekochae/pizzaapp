package com.example.pizzaapp.domain

class American(anzahl: Int, groesse: Groesse): Pizzateig(anzahl, groesse) {
    val zutaten = arrayListOf<Zutat>()

    init {
        zutaten.add(Zutat("Mehl", 59.9))
        zutaten.add(Zutat("Wasser", 36.0))
        zutaten.add(Zutat("Salz", 1.3))
        zutaten.add(Zutat("Trockenhefe", 0.1))
        zutaten.add(Zutat("Olivenöl", 1.5))
        zutaten.add(Zutat("Zucker", 1.2))
    }

    override fun getZutaten(): List<Zutat> {
        return zutaten
    }
}