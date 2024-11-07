package com.example.newproject

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class SelectLanguage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_selectlanguage)

        val languagesButton = findViewById<Button>(R.id.langb)

        languagesButton.setOnClickListener {
            val languages = arrayOf("English", "Spanish", "French", "German", "Chinese")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Select Language")
            builder.setItems(languages) { _, which ->
                val selectedLanguage = languages[which]

                Toast.makeText(this, "$selectedLanguage selected", Toast.LENGTH_SHORT).show()
            }
            builder.create().show()
        }
    }
}
