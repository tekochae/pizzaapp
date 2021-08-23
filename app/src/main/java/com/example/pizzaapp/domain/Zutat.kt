package com.example.pizzaapp.domain

import java.io.Serializable

data class Zutat(val bezeichnung: String, val prozent: Double) : Serializable {
    val prozentberechnungzutat = prozent / 100
}
data class BerechneteZutat(val bezeichnung: String, val grammwert: Double) : Serializable{
    val zutatrundenzweistellen = String.format("%.2f", grammwert).toDouble()
}
