package com.example.balbripcukotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ViewCourseUnits : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        lateinit var backButton: Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_course_units)

        backButton = findViewById<Button>(R.id.back_btn)
        backButton.setOnClickListener{
            //Toast.makeText(this,"View Button clicked!",Toast.LENGTH_SHORT.show())
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}