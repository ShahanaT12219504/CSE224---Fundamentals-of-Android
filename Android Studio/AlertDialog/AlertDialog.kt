package com.example.application8_10

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class AlertDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alertdialog)
        var subsbutton = findViewById<Button>(R.id.b)
        subsbutton.setOnClickListener {
            var a = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null)
            var b = AlertDialog.Builder(this).setView(a)
            b.setPositiveButton("Subscribe") { dialog, _ ->
                val e = a.findViewById<EditText>(R.id.editText)
                val email = e.text.toString()
                if (email.isNotBlank()) {
                    Toast.makeText(this, "Subscribed with $email", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Enter a valid email", Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            b.setNegativeButton("cancel") { dialog, _ -> dialog.dismiss() }

            b.create().show()
        }
    }
}
