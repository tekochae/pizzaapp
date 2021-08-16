package com.example.pizzaapp.domain.mapper

import com.example.pizzaapp.domain.*
import java.lang.RuntimeException

fun groesseMapper(spinnergroesse:String):Groesse {
    if(spinnergroesse.startsWith("klein")) {
        return Groesse.KLEIN_24
    }
    if(spinnergroesse.startsWith("mittel")) {
        return Groesse.MITTEL_28
    }
    if(spinnergroesse.startsWith("gross")) {
        return Groesse.GROSS_32
    }
    throw RuntimeException("Nicht supportete Grösse erhalten")

}

fun anzahlMapper(spinneranzahl: String): Int {
    return spinneranzahl.toInt()
    }

fun typMapper(spinnertype: String, anzahl: Int, groesse: Groesse): Pizzateig {
    if(spinnertype.startsWith("Napoletana")) {
        return Napoletana(anzahl, groesse)
    }
    if(spinnertype.startsWith("American")) {
        return American(anzahl, groesse)
    }
    if(spinnertype.startsWith("Swiss")) {
        return Swiss(anzahl, groesse)
    }
    throw RuntimeException("Nicht supportete Grösse erhalten")
}
