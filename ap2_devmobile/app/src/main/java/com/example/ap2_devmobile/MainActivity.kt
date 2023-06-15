package com.example.ap2_devmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val comecar: Button = findViewById(R.id.button)
        comecar.setOnClickListener{
            val intent = Intent(this, Question1::class.java)
            startActivity(intent)
        }

    }
}