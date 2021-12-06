package com.example.presensikaryawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cvWorkSchedule: Button = findViewById(R.id.cv_Work_Schedule)
        var cvCheckIn: Button = findViewById(R.id.cv_Check_In)
        var cvSalary: Button = findViewById(R.id.cv_salary)
        var cvlogout: Button = findViewById(R.id.cv_logout)

        cvWorkSchedule.setOnClickListener {
            var intent = Intent(this, Schedule::class.java)
            startActivity(intent)
        }

        cvCheckIn.setOnClickListener {
            var intent = Intent(this, Position::class.java)
            startActivity(intent)
        }

        cvSalary.setOnClickListener {
            var intent = Intent(this, Salary::class.java)
            startActivity(intent)
        }

        cvlogout.setOnClickListener {
            var intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}