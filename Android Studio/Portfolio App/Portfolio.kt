package com.example.newproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Portfolio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfolio)

        val exitButton = findViewById<Button>(R.id.button)
        exitButton.setOnClickListener {
            val b = AlertDialog.Builder(this)
            b.setTitle("Exit")
            b.setMessage("Do you want to exit?")
            b.setPositiveButton("Yes") { dialog, _ -> finish() }
            b.setNegativeButton("No") { dialog, _ ->dialog.dismiss() }
            b.setCancelable(false)
            b.create().show()
        }

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        val academics = findViewById<ImageButton>(R.id.ib1)
        val hobbies = findViewById<ImageButton>(R.id.ib2)
        val certs = findViewById<ImageButton>(R.id.ib3)
        val skills = findViewById<ImageButton>(R.id.ib4)


        academics.setOnClickListener {
            Toast.makeText(this, "Opening Academics section", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }


        hobbies.setOnClickListener {
            Toast.makeText(this, "Opening Hobbies section", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }


        certs.setOnClickListener {
            Toast.makeText(this, "Opening Certifications section", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CertificationsActivity::class.java)
            startActivity(intent)
        }


        skills.setOnClickListener {
            Toast.makeText(this, "Opening Skills section", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_portfolio, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.i1 -> {
                Toast.makeText(this, "Opening Email", Toast.LENGTH_SHORT).show()
                val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:shahananeels@gmail.com")
                }
                startActivity(emailIntent)
                true
            }
            R.id.i2 -> {
                Toast.makeText(this, "Opening Contacts", Toast.LENGTH_SHORT).show()
                val dialIntent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:+916381358577")
                }
                startActivity(dialIntent)
                true
            }
            R.id.i3 -> {
                Toast.makeText(this, "Opening Feedback form", Toast.LENGTH_SHORT).show()
                val feedbackIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://sz47ny1j78k.typeform.com/to/anxtBSCT"))
                startActivity(feedbackIntent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
