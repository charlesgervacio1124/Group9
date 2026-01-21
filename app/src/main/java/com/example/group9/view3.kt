package com.example.group9

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class view3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view3)


        val btnBack = findViewById<Button>(R.id.button)
        val btnNext = findViewById<Button>(R.id.button2)

        btnBack.setOnClickListener {
            finish()
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, view4::class.java)
            startActivity(intent)
        }
    }
}
