package com.example.pizzaapp.domain

import java.io.Serializable

enum class Fermentierung(val fermentierungsart: String) : Serializable {
    Kühlschrank("Bei der Fermentierung im Kühlschrank ...."), Raumtemperatur("Bei der Fermentierung nach Raumtemperatur ....")
}