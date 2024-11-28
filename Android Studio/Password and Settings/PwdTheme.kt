package com.example.application8_10

import android.content.SharedPreferences
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PwdTheme : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    private var isDarkTheme = false

    override fun onCreate(savedInstanceState: Bundle?) {
        sharedPreferences = getSharedPreferences("ThemePrefs", MODE_PRIVATE)
        isDarkTheme = sharedPreferences.getBoolean("isDarkTheme", false)

        setAppTheme()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pwd_theme)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    private fun setAppTheme() {
        if (isDarkTheme) {
            setTheme(android.R.style.ThemeOverlay_Material_Dark)
        } else {
            setTheme(android.R.style.ThemeOverlay_Material_Light)
        }
    }

    private fun saveThemePreference() {
        val editor = sharedPreferences.edit()
        editor.putBoolean("isDarkTheme", isDarkTheme)
        editor.apply()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_pwd_theme, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_change_theme -> {
                isDarkTheme = !isDarkTheme
                saveThemePreference()
                recreate()
                true
            }
            R.id.action_change_password -> {
                Toast.makeText(this, "Change Password clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_settings -> {
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
