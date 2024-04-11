package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var addButton: Button
    private lateinit var firstNum: EditText
    private lateinit var secondNum: EditText
    private lateinit var resultView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        addButton = findViewById(R.id.addBtn)
        firstNum = findViewById(R.id.firstNumEditText)
        secondNum = findViewById(R.id.num2editText)
        resultView = findViewById(R.id.resultTextView)

        addButton.setOnClickListener {
            // Do something in response to the click here
            val num1 = Integer.parseInt(firstNum.getText().toString())
            val num2 = Integer.parseInt(secondNum.getText().toString())
            val result = num1 + num2

            resultView.text = result.toString()
        }
    }
}