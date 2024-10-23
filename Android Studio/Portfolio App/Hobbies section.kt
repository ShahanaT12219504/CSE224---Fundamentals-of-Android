package com.example.newproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

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
