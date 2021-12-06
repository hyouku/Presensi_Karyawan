package com.example.presensikaryawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Position : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_position)

        var cvcheckin: Button = findViewById(R.id.chekin)

        cvcheckin.setOnClickListener {
            var intent = Intent(this, Finger_Print::class.java)
            startActivity(intent)
        }
    }
}