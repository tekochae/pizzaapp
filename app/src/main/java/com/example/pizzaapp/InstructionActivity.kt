package com.example.pizzaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.TextView
import com.example.pizzaapp.domain.Fermentierung
import com.example.pizzaapp.domain.Pizzateig

class InstructionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruction)

        val fermentiere = intent.extras?.get("Fermentierungsprozess") as Fermentierung
        val anzeige = findViewById<TextView>(R.id.AnzeigeFermentierungsprozess)
        anzeige.text = fermentiere.fermentierungsart
    }

    fun onclick(view: View) {
        val intent = Intent(this, ChooseActivity::class.java)
        startActivity(intent)
    }

    fun startClock(view: View) {
        val intent = Intent(AlarmClock.ACTION_SHOW_TIMERS)
        startActivity(intent)
    }
}

