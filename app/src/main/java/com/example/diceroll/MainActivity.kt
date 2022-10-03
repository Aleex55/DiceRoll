package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val elTexto = findViewById<TextView>(R.id.textView) as TextView;
        val elBoton = findViewById<Button>(R.id.button) as Button;

        elBoton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Rolling the dice!", Toast.LENGTH_SHORT).show();

            elTexto.text = roll().toString();

        }
    }
    fun roll(): Int {
        return (1..6).random();
    }
}