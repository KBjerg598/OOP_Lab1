package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calculateSquareArea(view: View) {
        val editText = findViewById<EditText>(R.id.edit_text_number_square)
        val text = editText.text.toString()
        val sideSquare = text.toDouble()
        val area =  round(sideSquare * sideSquare)/10.0
        val areaSquare:String = area.toString()
        textAreaSquare?.setText(areaSquare)
        textAreaSquare = findViewById(R.id.textAreaSquare)
    }
}