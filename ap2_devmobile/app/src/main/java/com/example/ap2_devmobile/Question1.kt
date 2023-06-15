package com.example.ap2_devmobile

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton

class Question1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_one)

        val imageButton : ImageButton = findViewById(R.id.imageButton)
        imageButton.setOnClickListener{
            Data.local = 1
            val intent = Intent(this, Question2::class.java)
            startActivity(intent)
        }

        val imageButton2 : ImageButton = findViewById(R.id.imageButton2)
        imageButton2.setOnClickListener{
            Data.local = 2
            val intent = Intent(this, Question2::class.java)
            startActivity(intent)
        }

        val imageButton3 : ImageButton = findViewById(R.id.imageButton3)
        imageButton3.setOnClickListener{
            Data.local = 3
            val intent = Intent(this, Question2::class.java)
            startActivity(intent)
        }
        }
    }
