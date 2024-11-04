package com.example.application8_10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class ExitButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exit_button)

        // Exit button functionality
        val exitButton = findViewById<Button>(R.id.b)
        exitButton.setOnClickListener {
            val b = AlertDialog.Builder(this)
            b.setTitle("Exit")
            b.setMessage("Do you want to exit?")
            b.setPositiveButton("Yes") { dialog, _ -> finish() }
            b.setNegativeButton("No") { dialog, _ ->dialog.dismiss() }
            b.setNeutralButton("Maybe") { dialog, _ -> dialog.cancel() }
            b.setCancelable(false)
            b.create().show()
        }

        // Rating button functionality
        val ratingButton: Button = findViewById(R.id.button5)
        ratingButton.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Rate Us")
            builder.setMessage("Would you like to give a rating?")
            builder.setPositiveButton("Yes") { dialog, _ ->

                val intent = Intent(this, RatingActivity::class.java)
                startActivity(intent)
            }
            builder.setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }
            builder.setNeutralButton("Remind Me Later") { dialog, _ ->
                dialog.cancel()
            }
            builder.create().show()
        }
    }
}
