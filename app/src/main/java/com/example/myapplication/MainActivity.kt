package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var ivVeg:ImageButton
    lateinit var ivFruits:ImageButton
    lateinit var ivCereals:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivVeg = findViewById(R.id.ivVeg)
        ivFruits = findViewById(R.id.ivFruits)
        ivCereals = findViewById(R.id.ivCereals)

        ivVeg.setOnClickListener{
            startActivity(Intent(this,Vegetables::class.java))
        }

        ivCereals.setOnClickListener {
            startActivity(Intent(this,Cereal::class.java))
        }

        ivFruits.setOnClickListener {
            startActivity(Intent(this,Fruits::class.java))
        }
    }
}