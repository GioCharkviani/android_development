package com.example.task4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var operatori: String
    private var pirveli: Double = 0.0
    private var meore: Double = 0.0
    private var saboloo: Double = 0.0
    private lateinit var shedegi: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun ricxvisDamateba(button: Button) {
        val text1 = shedegi.text.toString()

        val text2 = button.text.toString()
        shedegi.text = text1 + text2
    }

    fun gasuftaveba() {
        shedegi.text = ""
        operatori = ""
        pirveli = 0.0
        meore = 0.0
        saboloo = 0.0
    }

    @SuppressLint("SetTextI18n")
    fun operatorisDamaxsovreba(button: Button) {
        val pirveli = shedegi.text.toString().toDouble()

        val operatori = button.text.toString()
    }

    fun gamotvla(button: Button) {
        val meore = shedegi.text.toString().toDouble()

        if(operatori == "+") {
            saboloo = pirveli + meore;
        } else if(operatori == "-") {
            saboloo = pirveli + meore;
        } else if(operatori == "*") {
            saboloo = pirveli * meore;
        } else if(operatori == "/") {
            saboloo = pirveli / meore;
        }

        shedegi.text = saboloo.toString()
    }

}