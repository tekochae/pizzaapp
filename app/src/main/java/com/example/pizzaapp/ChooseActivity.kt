package com.example.pizzaapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.pizzaapp.domain.mapper.anzahlMapper
import com.example.pizzaapp.domain.mapper.groesseMapper
import com.example.pizzaapp.domain.mapper.typMapper

class ChooseActivity : AppCompatActivity() {
    lateinit var spinnertyp: Spinner
    lateinit var spinneranzahl: Spinner
    lateinit var spinnergroesse: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        spinnertyp = findViewById(R.id.choosepizzatyp);
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

        spinneranzahl = findViewById(R.id.choosepizzaanzahl);

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

        spinnergroesse = findViewById(R.id.choosepizzagroesse);

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
    fun berechne(view: View) {
        val groesseMapper = groesseMapper(spinnergroesse.selectedItem.toString())
        val anzahlMapper = anzahlMapper(spinneranzahl.selectedItem.toString())
        val pizzateig = typMapper(spinnertyp.selectedItem.toString(), anzahlMapper, groesseMapper)
        //Code von Intent Wechsel auf Rezept Activity noch einbinden --> put Extra Tipe Mapper

        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("Zutaten-Infos", pizzateig)
        startActivity(intent)
    }


}