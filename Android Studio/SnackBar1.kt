package com.example.myapplication3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class SnackBar2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar2)

        val message = intent.getStringExtra("WELCOME_MESSAGE")
        val messageTextView = findViewById<TextView>(R.id.messageTextView)

        // Display the message in the TextView
        messageTextView.text = message ?: "No message received"

        // Show Snackbar with an action
        Snackbar.make(messageTextView, "Welcome!", Snackbar.LENGTH_LONG)
            .setAction("OK") {
                // Optional action when Snackbar is clicked
            }
            .show()
    }
}
