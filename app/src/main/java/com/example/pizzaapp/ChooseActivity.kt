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
            //R.layout.spinner_item
            R.layout.spinner_item
            //android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(R.layout.spinner_item)
            adapter.setDropDownViewResource(R.layout.spiner_dropdown_item);
                    spinnertyp.setAdapter(adapter);
            // Apply the adapter to the spinner
            //spinnertyp.adapter = adapter
        }

        spinneranzahl = findViewById(R.id.choosepizzaanzahl);

        ArrayAdapter.createFromResource(
            this,
            R.array.choosepizzaanzahl,
            R.layout.spinner_item
            //android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(R.layout.spinner_item)
            adapter.setDropDownViewResource(R.layout.spiner_dropdown_item);
            spinneranzahl.setAdapter(adapter);
            // Apply the adapter to the spinner
            //spinneranzahl.adapter = adapter
        }

        spinnergroesse = findViewById(R.id.choosepizzagroesse);

        ArrayAdapter.createFromResource(
            this,
            R.array.choosepizzagroesse,
            R.layout.spinner_item
            //android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(R.layout.spinner_item)
            adapter.setDropDownViewResource(R.layout.spiner_dropdown_item);
            spinnergroesse.setAdapter(adapter);
            // Apply the adapter to the spinner
            //spinnergroesse.adapter = adapter
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