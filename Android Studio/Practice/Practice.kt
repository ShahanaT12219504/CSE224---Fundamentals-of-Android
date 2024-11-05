package com.example.application8_10

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class PracticeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        findViewById<Button>(R.id.button3).setOnClickListener {
            Toast.makeText(this, "Starting the course", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            Toast.makeText(this, "Starting the course", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_practice, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.i1 -> {
                Toast.makeText(this, "E-mail clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.i2 -> {
                Toast.makeText(this, "Contacts clicked", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
