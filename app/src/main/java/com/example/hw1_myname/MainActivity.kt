package com.example.hw1_myname

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myName = "Yuanyuan Wang"
        val textView: TextView = findViewById(R.id.textView)
        textView.text = "Hi, my name is $myName."

        val layout: ConstraintLayout = findViewById(R.id.layout)
        layout.setBackgroundColor(Color.CYAN)
    }
}