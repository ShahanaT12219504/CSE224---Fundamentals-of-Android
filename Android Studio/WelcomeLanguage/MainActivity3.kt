package com.example.application8_10

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val nameEditText: EditText = findViewById(R.id.nameET)
        val languageSpinner: Spinner = findViewById(R.id.langSpinner)
        val goButton: Button = findViewById(R.id.goButton)
        val resultTextView: TextView = findViewById(R.id.resTV)

        val languages = arrayOf("Japanese", "Korean", "Spanish")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        languageSpinner.adapter = adapter

        goButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val selectedLanguage = languageSpinner.selectedItem.toString()

            if (name.isBlank()) {
                Toast.makeText(this, "Please enter your name!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val welcomeMessage = when (selectedLanguage) {
                "Japanese" -> "ようこそ, $name!"
                "Korean" -> "환영합니다, $name!"
                "Spanish" -> "¡Bienvenido, $name!"
                else -> "Welcome, $name!"
            }

            resultTextView.text = welcomeMessage
            resultTextView.visibility = View.VISIBLE
        }
    }
}
