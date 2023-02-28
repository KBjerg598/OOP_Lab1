package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.lang.Math.round

class MainActivity : AppCompatActivity() {
    var textAreaRectangle: TextView? = null
    var textAreaCircle: TextView? = null
    var textAreaSquare: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun CircleArea(view: View) {
        val editText = findViewById<EditText>(R.id.edit_text_number_circle)
        val text = editText.text.toString()
        val radius = text.toDouble()
        val pi = 3.14
        var area = round(pi * radius * radius)/10.0
        var areaCircle:String = area.toString()
        textAreaCircle?.setText(areaCircle)
        textAreaCircle = findViewById(R.id.textAreaCircle)
    }
    fun SquareArea(view: View) {
        val editText = findViewById<EditText>(R.id.edit_text_number_square)
        val text = editText.text.toString()
        val sideSquare = text.toDouble()
        val area =  round(sideSquare * sideSquare)/10.0
        val areaSquare:String = area.toString()
        textAreaSquare?.setText(areaSquare)
        textAreaSquare = findViewById(R.id.textAreaSquare)
    }
}