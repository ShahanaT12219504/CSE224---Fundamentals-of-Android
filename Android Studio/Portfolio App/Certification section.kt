package com.example.newproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CertificationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_certifications)

        class EducationActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_education) 
                
                val backButton = findViewById<Button>(R.id.back_button)
                backButton.setOnClickListener {
                    val intent = Intent(this, Portfolio::class.java)
                    startActivity(intent)
                }
            }
        }


        val cert1 = findViewById<ImageView>(R.id.cert1)
        val cert2 = findViewById<ImageView>(R.id.cert2)
        
        cert1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.org/account/accomplishments/verify/G7U3XI2AMV7P"))
            startActivity(intent)
        }

        cert2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.org/account/accomplishments/verify/U3243HYV5S4B"))
            startActivity(intent)
        }

        val backButton = findViewById<Button>(R.id.back_button)
        backButton.setOnClickListener {
            val intent = Intent(this, Portfolio::class.java)
            startActivity(intent)
        }




    }
}
