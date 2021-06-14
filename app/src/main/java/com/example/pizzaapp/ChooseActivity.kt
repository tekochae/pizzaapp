package com.example.pizzaapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class ChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose)

        val spinnertyp: Spinner = findViewById(R.id.choosepizzatyp);

        ArrayAdapter.createFromResource(
            this,
            R.array.choosepizzatyp,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnertyp.adapter = adapter
        }

        val spinneranzahl: Spinner = findViewById(R.id.choosepizzaanzahl);

        ArrayAdapter.createFromResource(
            this,
            R.array.choosepizzaanzahl,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinneranzahl.adapter = adapter
        }

        val spinnergroesse: Spinner = findViewById(R.id.choosepizzagroesse);

        ArrayAdapter.createFromResource(
            this,
            R.array.choosepizzagroesse,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnergroesse.adapter = adapter
        }
    }
}