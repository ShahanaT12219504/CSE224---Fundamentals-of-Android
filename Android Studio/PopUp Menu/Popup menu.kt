package com.example.newproject

import android.os.Bundle
import android.view.MenuInflater
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class PopupMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_popup_menu)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val j = PopupMenu(this, button)
            j.menuInflater.inflate(R.menu.popup_menu, j.menu)

            j.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.share -> {
                        Toast.makeText(this, "Share clicked", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.del -> {
                        Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
            j.show()
        }
    }
}
