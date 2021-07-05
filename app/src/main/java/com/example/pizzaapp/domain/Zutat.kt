package com.example.pizzaapp.domain

data class Zutat(val bezeichnung: String, val prozent: Double){
    val prozentberechnungzutat = prozent / 100
}
data class BerechneteZutat(val bezeichnung: String, val grammwert: Double){
    val zutatrundenzweistellen = String.format("%.2f", grammwert).toDouble()
}
