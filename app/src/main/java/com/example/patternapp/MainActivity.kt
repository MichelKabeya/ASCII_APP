package com.example.patternapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Declaration of variables
        val txtPattern = findViewById<TextView>(R.id.textPat)

        var pattern = ""
        //initiating a row variable that control the number of lines
        var row = 1
        // while loop to performs iterations
        while (row <= 5) {
            // 
            var col = 1

            while (col <= row) {
                pattern += "* "
                col++
            }

            pattern += "\n"
            row++
        }

        txtPattern.text = pattern



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}