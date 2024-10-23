package com.example.newproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EducationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        class EducationActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_education)

                // Back to Homepage Button functionality
                val backButton = findViewById<Button>(R.id.back_button)
                backButton.setOnClickListener {
                    val intent = Intent(this, Portfolio::class.java)
                    startActivity(intent)
                }
            }
        }

        val backButton = findViewById<Button>(R.id.back_button)
        backButton.setOnClickListener {
            val intent = Intent(this, Portfolio::class.java)
            startActivity(intent)
        }



    }
}
