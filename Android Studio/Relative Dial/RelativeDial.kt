package com.example.application8_10

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RelativeDial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_dial)

        val callButton = findViewById<Button>(R.id.callbtn)
        val nameField = findViewById<EditText>(R.id.name)
        val mobileField = findViewById<EditText>(R.id.mobNum)

        callButton.setOnClickListener {
            val name = nameField.text.toString()
            val mobileNumber = mobileField.text.toString()

            if (name.isNotBlank() && mobileNumber.isNotBlank()) {
                Toast.makeText(this, "Calling $name", Toast.LENGTH_LONG).show()

                val intent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:$mobileNumber")
                }
                startActivity(intent)
            }
        }
    }
}
