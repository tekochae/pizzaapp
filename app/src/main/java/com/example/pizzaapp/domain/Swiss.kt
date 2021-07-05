package com.example.pizzaapp.domain

class Swiss(anzahl: Int, groesse: Groesse): Pizzateig(anzahl, groesse) {
    val zutaten = arrayListOf<Zutat>()

    init {
        zutaten.add(Zutat("Mehl", 30.0))
        zutaten.add(Zutat("Wasser", 10.0))
        zutaten.add(Zutat("Salz", 20.0))
        zutaten.add(Zutat("Trockenhefe", 20.0))
        zutaten.add(Zutat("Käse", 20.0))
    }

    override fun getZutaten(): List<Zutat> {
        return zutaten
    }
}