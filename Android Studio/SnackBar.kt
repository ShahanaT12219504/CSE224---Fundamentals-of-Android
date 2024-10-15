package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class SnackBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)

        // Setting up image buttons with click listeners
        findViewById<ImageButton>(R.id.imageButton1).setOnClickListener { view ->
            showSnackbar(view, "Welcome to School of CSE")
        }
        findViewById<ImageButton>(R.id.imageButton2).setOnClickListener { view ->
            showSnackbar(view, "Welcome to School of Business")
        }
        findViewById<ImageButton>(R.id.imageButton3).setOnClickListener { view ->
            showSnackbar(view, "Welcome to School of Arch & Design")
        }
        findViewById<ImageButton>(R.id.imageButton4).setOnClickListener { view ->
            showSnackbar(view, "Welcome to School of Polytechnic")
        }
        findViewById<ImageButton>(R.id.imageButton5).setOnClickListener { view ->
            showSnackbar(view, "Welcome to School of Physical Ed")
        }
        findViewById<ImageButton>(R.id.imageButton6).setOnClickListener { view ->
            showSnackbar(view, "Welcome to School of Civil Eng")
        }
        findViewById<ImageButton>(R.id.imageButton7).setOnClickListener { view ->
            showSnackbar(view, "Welcome to School of Design1 (Fashion)")
        }
        findViewById<ImageButton>(R.id.imageButton8).setOnClickListener { view ->
            showSnackbar(view, "Welcome to School of Literal & Creative Arts")
        }
        findViewById<ImageButton>(R.id.imageButton9).setOnClickListener { view ->
            showSnackbar(view, "Welcome to School of Design2 (Interior & Furniture)")
        }
    }

    private fun showSnackbar(view: android.view.View, message: String) {
        Snackbar.make(view, "Do you want to enter?", Snackbar.LENGTH_LONG)
            .setAction("Yes") {
                val intent = Intent(this, SnackBar2::class.java)
                intent.putExtra("WELCOME_MESSAGE", message)
                startActivity(intent)
            }
            .show()
    }
}
