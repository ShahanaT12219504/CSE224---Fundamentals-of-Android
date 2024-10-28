package com.example.newproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Appchoser2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_appchoser2)

        val a = findViewById<CheckBox>(R.id.quote1)
        val b = findViewById<CheckBox>(R.id.quote2)
        val c = findViewById<CheckBox>(R.id.quote3)

        val shareButton: Button = findViewById(R.id.sharebtn)

        shareButton.setOnClickListener {
            val selectedQuotes = mutableListOf<String>()

            if (a.isChecked) selectedQuotes.add(a.text.toString())
            if (b.isChecked) selectedQuotes.add(b.text.toString())
            if (c.isChecked) selectedQuotes.add(c.text.toString())

            if (selectedQuotes.isNotEmpty()) {
                val quotesToShare = selectedQuotes.joinToString(separator = "\n")
                Sharetxt(quotesToShare)
            }
        }
    }

    private fun Sharetxt(message: String) {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(sendIntent, "Share via")
        startActivity(shareIntent)
    }
}
