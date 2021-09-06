package com.example.pizzaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.pizzaapp.domain.Pizzateig
import com.example.pizzaapp.domain.mapper.anzahlMapper
import com.example.pizzaapp.domain.mapper.fermentiereMapper
import com.example.pizzaapp.domain.mapper.groesseMapper
import com.example.pizzaapp.domain.mapper.typMapper

class ResultActivity : AppCompatActivity() {
    lateinit var spinnerfermentierung: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val pizzateig = intent.extras?.get("Zutaten-Infos") as Pizzateig
        val anzeige = findViewById<TextView>(R.id.AnzeigeBerechnungZutaten)
        anzeige.text = pizzateig.anzeigeBerechnung()

        spinnerfermentierung = findViewById(R.id.choosefermentierung);
        ArrayAdapter.createFromResource(
            this,
            R.array.choosefermentierung,
            R.layout.spinner_item
            //android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(R.layout.spinner_item)
            adapter.setDropDownViewResource(R.layout.spiner_dropdown_item);
            spinnerfermentierung.setAdapter(adapter);
            // Apply the adapter to the spinner
            //spinnerfermentierung.adapter = adapter
        }
    }
    fun onclick (view: View) {
        val intent = Intent(this, ChooseActivity::class.java)
        startActivity(intent)
    }
    fun fermentiere(view: View) {
        val fermentiereMapper = fermentiereMapper(spinnerfermentierung.selectedItem.toString())
        //Code von Intent Wechsel auf Rezept Activity noch einbinden --> put Extra Tipe Mapper

        val intent = Intent(this, InstructionActivity::class.java)
        intent.putExtra("Fermentierungsprozess", fermentiereMapper)
        startActivity(intent)
    }
}
