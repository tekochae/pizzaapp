package com.example.pizzaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.pizzaapp.domain.Pizzateig

class ResultActivity : AppCompatActivity() {


    //lateinit var spinnerfermentierung: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val pizzateig = intent.extras?.get("Zutaten-Infos") as Pizzateig
        val anzeige = findViewById<TextView>(R.id.AnzeigeBerechnungZutaten)
        anzeige.text = pizzateig.anzeigeBerechnung()

//        spinnerfermentierung = findViewById(R.id.choosefermentierung);
//        ArrayAdapter.createFromResource(
//            this,
//            R.array.choosefermentierung,
//            android.R.layout.simple_spinner_item
//        ).also { adapter ->
//            // Specify the layout to use when the list of choices appears
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            // Apply the adapter to the spinner
//            spinnerfermentierung.adapter = adapter
//        }
    }
}
