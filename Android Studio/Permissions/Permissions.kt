package com.example.application8_10

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainPermission : AppCompatActivity() {
    var c = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.`activity_mainpermission`)
        var b1 = findViewById<Button>(R.id.btn)
        b1.setOnClickListener {
            if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA)== PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),c)
            }
            else{
                Toast.makeText(this,"Permission Already granted",Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == c){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"Camera permission granted",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Camera permission denied",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
