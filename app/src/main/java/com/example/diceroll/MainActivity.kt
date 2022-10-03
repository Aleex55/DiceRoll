package com.example.diceroll

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val laImagen = findViewById<ImageView>(R.id.imageView) as ImageView
        val elBoton = findViewById<Button>(R.id.button) as Button

        elBoton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Rolling the dice!", Toast.LENGTH_SHORT).show()


        }
    }
    fun roll(){
        val laImagen = findViewById<ImageView>(R.id.imageView) as ImageView;
        val elRandom =  (1..6).random();

        when (elRandom) {
            1 -> laImagen.setImageResource(R.drawable.dice_1);
            2 -> laImagen.setImageResource(R.drawable.dice_2);
            3 -> laImagen.setImageResource(R.drawable.dice_3);
            4 -> laImagen.setImageResource(R.drawable.dice_4);
            5 -> laImagen.setImageResource(R.drawable.dice_4);
            else -> { // Note the block
                laImagen.setImageResource(R.drawable.dice_6);
            }
        }

    }
}