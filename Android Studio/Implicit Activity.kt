package com.example.newproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val camera = findViewById<Button>(R.id.Button1)
        val url = findViewById<Button>(R.id.Button2)
        val calllog = findViewById<Button>(R.id.Button3)
        val contacts = findViewById<Button>(R.id.Button4)
        val gallery = findViewById<Button>(R.id.Button5)
        val dial = findViewById<Button>(R.id.Button6)


        camera.setOnClickListener {
            val i1 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i1)
        }

        url.setOnClickListener {
            val i2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/"))
            startActivity(i2)
        }

        calllog.setOnClickListener {
            val i3 = Intent(Intent.ACTION_VIEW)
            i3.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(i3)
        }

        contacts.setOnClickListener {
            val i4 = Intent(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI)
            startActivity(i4)
        }

        gallery.setOnClickListener {
            val i5 = Intent()
            i5.action = Intent.ACTION_VIEW
            i5.type="image/*"
            startActivity(i5)
        }

        dial.setOnClickListener {
            val i6 = Intent(Intent.ACTION_DIAL)
            i6.setData(Uri.parse("tel:+911234567890"))
            startActivity(i6)
        }




    }
}
