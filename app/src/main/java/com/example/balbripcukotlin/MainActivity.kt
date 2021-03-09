package com.example.balbripcukotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var viewButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     //View Button
//        val viewBtn: Button = findViewById<Button>(R.id.back_btn)
        viewButton = findViewById<Button>(R.id.viewBtn)

        viewButton.setOnClickListener{
            //Toast.makeText(this,"View Button clicked!",Toast.LENGTH_SHORT.show())
            val intent = Intent(this,ViewCourseUnits::class.java)
            startActivity(intent)
        }

    }
}