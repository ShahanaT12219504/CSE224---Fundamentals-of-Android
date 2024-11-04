package com.example.application8_10

import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class RatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating)

        val ratingBar: RatingBar = findViewById(R.id.ratingBar)

        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            Toast.makeText(this, "$rating star rating given", Toast.LENGTH_SHORT).show()
        }
    }
}
