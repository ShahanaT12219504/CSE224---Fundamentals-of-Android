package com.example.myapplication

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main1)
        var a = findViewById<ImageButton>(R.id.imageButton3)
        var b = findViewById<ImageButton>(R.id.imageButton4)
        var c = findViewById<ImageView>(R.id.imageView)
        var d = findViewById<ImageView>(R.id.imageView2)

        a.setOnClickListener {
            Toast.makeText(this, "Image button clicked", Toast.LENGTH_LONG).show()
        }

        b.setOnClickListener {
            Toast.makeText(this, "Image button clicked", Toast.LENGTH_LONG).show()
        }

        c.setOnClickListener {
            Toast.makeText(this, "Image view button clicked", Toast.LENGTH_LONG).show()
        }

        d.setOnClickListener {
            Toast.makeText(this, "Image view button clicked", Toast.LENGTH_LONG).show()
        }

    }
}













