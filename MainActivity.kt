package com.example.myapplication44

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
       @SuppressLint("WrongViewCast")
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the view
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {}
        val age = ageNumber.text.toString().toIntOrNull()
        if (age != null) {
            val result = when (age) {
                in 20..22 -> "XXXTENTCION"
                in 21..26 -> "2PAC"
                in 27..36 -> "BOB MARLEY"
                in 37..48 -> "WHITNEY HOUSTON"
                in 49..56 -> "STEVE JOBS"
                in 57..60 -> "DIEGO MARADONA"
                in 61..70 -> "NINA SIMONE"
                in 71..82 -> "NIEL ARMSTRONG"
                in 83..90 -> "DESMOND TUTU"
                in 91..96 -> "QUEEN ELIZABETH"
                else -> "age is not in the range"
            }
            txtResult.text = "Age: $age/n${
                when (result) {
                    "XXXTENTACION" -> "XXXTENTACION DIED BETWEEN AGES OF 20 AND 22"
                    "2PAC" -> "2PAC DIED BETWEEN AGES OF 21 AND 26"
                    "BOB MARLEY" -> "BOB MARLEY DIED BETWEEN AGES OF 27 AND 36"
                    "WHITNEY HOUSTON" -> "WHITNEY HOUSTON DIED BETWEEN AGES OF 37 AND 48"
                    "STEVE JOBS" -> "STEVE JOBS DIED BETWEEN AGES OF 49 AND 56 "
                    "DIEGO MARADONA" -> "DIEGO MARADONA DIED BETWEEN AGES OF 57 AND 60"
                    "NINA SIMSON" -> "NINA SIMSON DIED BETWEEN AGES OF 61 AND 70"
                    "NIEL ARMSTRONG" -> "NIEL ARMSTRONG DIED BETWEEN OF 71 AND 82"
                    "DESMOND TUTU" -> "DESMOMD TUTU DIED BETWEEN OF 83 AND 90"
                    "QUEEN ELIZABETH" -> "QUEEN ELIZABETH DIED BETWEEN AGES OF 91 AND 96"
                    else -> {
                        "age is not in the range"
                    }
                }
            }"
        } else {
            txtResult.text = "Please enter a valid age"
        }


        btnCancel.setOnClickListener {

            ageNumber.text.clear()
            txtResult.text = ""
        }

    }
}