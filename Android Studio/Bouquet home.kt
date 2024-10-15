package com.example.myapplication3

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Intentdemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intentdemo)

        val imageButton1 = findViewById<ImageButton>(R.id.imageButton)
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton1)
        val imageButton3 = findViewById<ImageButton>(R.id.imageButton2)
        val imageButton4 = findViewById<ImageButton>(R.id.imageButton3)

        imageButton1.setOnClickListener { Toast.makeText(this, "Image 1 clicked", Toast.LENGTH_SHORT).show() }
        imageButton2.setOnClickListener { Toast.makeText(this, "Image 2 clicked", Toast.LENGTH_SHORT).show() }
        imageButton3.setOnClickListener { Toast.makeText(this, "Image 3 clicked", Toast.LENGTH_SHORT).show() }
        imageButton4.setOnClickListener { Toast.makeText(this, "Image 4 clicked", Toast.LENGTH_SHORT).show() }

        val bouquetSpinner = findViewById<Spinner>(R.id.bouquetSpinner)
        val bouquetOptions = arrayOf("Roses", "Tulips", "Sunflowers", "Orchids")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, bouquetOptions)
        bouquetSpinner.adapter = adapter

        val buyButton = findViewById<Button>(R.id.buyButton)
        val deliveryButton = findViewById<Button>(R.id.deliveryButton)

        buyButton.setOnClickListener {
            val selectedBouquet = bouquetSpinner.selectedItem.toString()
            Toast.makeText(this, "Buying: $selectedBouquet", Toast.LENGTH_SHORT).show()
        }

        deliveryButton.setOnClickListener {
            val selectedBouquet = bouquetSpinner.selectedItem.toString()
            Toast.makeText(this, "Delivery for: $selectedBouquet", Toast.LENGTH_SHORT).show()
        }
    }
}
