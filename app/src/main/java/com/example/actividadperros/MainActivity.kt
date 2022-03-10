package com.example.actividadperros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val borderCollieButton=findViewById<Button>(R.id.buttonCollie)
        borderCollieButton.setOnClickListener {
            startActivity(Intent(this, BorderCollieActivity::class.java))
        }
        val canicheButton=findViewById<Button>(R.id.buttonCaniche)
        canicheButton.setOnClickListener {
            startActivity(Intent(this, CanicheActivity::class.java))
        }
        val pastorButton=findViewById<Button>(R.id.buttonPastor)
        pastorButton.setOnClickListener {
            startActivity(Intent(this, PastorActivity::class.java))
        }
        val goldenButton=findViewById<Button>(R.id.buttonGolden)
        goldenButton.setOnClickListener {
            startActivity(Intent(this, GoldenActivity::class.java))
        }
        val dobermanButton=findViewById<Button>(R.id.buttonDobermann)
        dobermanButton.setOnClickListener {
            startActivity(Intent(this, DobermannActivity::class.java))
        }
    }
}