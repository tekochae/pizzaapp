package com.example.pizzaapp.domain

import java.io.Serializable

enum class Fermentierung(val fermentierungsart: String) : Serializable {
    Kühlschrank("Raumtemperatur:\n" +
            "- Alle trockenen Zutaten vermengen\n" +
            "- Flüssige Zutaten langsam darunter mischen\n" +
            "- Teigmasse ca. 15 Minuten durchkneten (mit Maschine ca. 10 Minuten)\n" +
            "- Teigmasse in Schüssel Luftdicht verschliessen und 12 Stunden bei Raumtemperatur gehen lassen\n" +
            "- Teigmasse in einzelne Teigkugeln für Pizzas formen (Klein = 240g, Mittel = 280g, Gross = 320g)\n" +
            "- Teigballen in Luftdichten Behälter nochmals 3-4 Stunden gehen lassen\n" +
            "- Pizza mit viel Liebe zubereiten und geniessen :-)"),
    Raumtemperatur("Bei der Fermentierung nach Raumtemperatur ....")
}