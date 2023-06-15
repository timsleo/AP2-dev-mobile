package com.example.ap2_devmobile

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton

class Question2 : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_two)

        val a : RadioButton = findViewById(R.id.a)
            a.setOnClickListener{
                Data.atividade = 1
                val intent = Intent(this, Question3::class.java)
                startActivity(intent)
            }

        val b : RadioButton = findViewById(R.id.b)
        b.setOnClickListener{
            Data.atividade = 2
            val intent = Intent(this, Question3::class.java)
            startActivity(intent)
        }

        val c : RadioButton = findViewById(R.id.c)
        c.setOnClickListener{
            Data.atividade = 3
            val intent = Intent(this, Question3::class.java)
            startActivity(intent)
        }

        val d : RadioButton = findViewById(R.id.d)
        d.setOnClickListener{
            Data.atividade = 4
            val intent = Intent(this, Question3::class.java)
            startActivity(intent)
        }

        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.botaoFragment, FragmentVoltar())
                .commit()
        }

    }
}