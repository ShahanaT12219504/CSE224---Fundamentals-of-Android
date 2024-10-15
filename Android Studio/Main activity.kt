package com.example.myapplication2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        
        val a = findViewById<EditText>(R.id.editText1)
        val b = findViewById<EditText>(R.id.editText2)
        val btn = findViewById<Button>(R.id.button)
        val txtvw = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener {
            var c = a.text.toString()
            var d = b.text.toString()
            txtvw.text = "your name is " + c + "\nyour number is" + d
        }
    }
  }
