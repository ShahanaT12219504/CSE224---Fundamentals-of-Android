package com.example.application8_10

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class StringsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_strings)

        val buttonEnglish = findViewById<Button>(R.id.btneng)
        val buttonTamil = findViewById<Button>(R.id.btnTamil) 
        
        buttonEnglish.setOnClickListener {
            setLocale("en") 
        }

        buttonTamil.setOnClickListener {
            setLocale("ta") 
        }
    }

    fun setLocale(langCode: String) {
        // Check if the current locale is different before applying the new one
        val current = resources.configuration.locales.get(0).language
        if (langCode != current) {
            val locale = Locale(langCode)
            Locale.setDefault(locale)
            val config = Configuration(resources.configuration)
            config.setLocale(locale)
            resources.updateConfiguration(config, resources.displayMetrics)
        }
        recreate()
    }
}
