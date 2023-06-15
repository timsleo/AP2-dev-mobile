package com.example.ap2_devmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton

class Question3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_three)

        val aa : RadioButton = findViewById(R.id.aa)
        aa.setOnClickListener{
            Data.role = 1
            val intent = Intent(this, Result::class.java)
            startActivity(intent)
        }

        val bb : RadioButton = findViewById(R.id.bb)
        bb.setOnClickListener{
            Data.role = 2
            val intent = Intent(this, Result::class.java)
            startActivity(intent)
        }

        val cc : RadioButton = findViewById(R.id.cc)
        cc.setOnClickListener{
            Data.role = 3
            val intent = Intent(this, Result::class.java)
            startActivity(intent)
        }

        val dd : RadioButton = findViewById(R.id.dd)
        dd.setOnClickListener{
            Data.role = 4
            val intent = Intent(this, Result::class.java)
            startActivity(intent)
        }

        /*if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.botaoFragment, FragmentVoltar())
                .commit()
        }*/

    }
}