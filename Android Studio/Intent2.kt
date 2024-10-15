package com.example.myapplication2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        val searchButton = findViewById<Button>(R.id.search_button)
        val profileButton = findViewById<Button>(R.id.profileButton)
        val categoriesButton = findViewById<Button>(R.id.categoriesButton)
        val accountButton = findViewById<Button>(R.id.accountButton)
        val cartButton = findViewById<Button>(R.id.cartButton)

        searchButton.setOnClickListener {
            Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show()
        }

        profileButton.setOnClickListener {
            Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
        }

        categoriesButton.setOnClickListener {
            Toast.makeText(this, "Categories clicked", Toast.LENGTH_SHORT).show()
        }

        accountButton.setOnClickListener {
            Toast.makeText(this, "Account clicked", Toast.LENGTH_SHORT).show()
        }

        cartButton.setOnClickListener {
            Toast.makeText(this, "Cart clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
