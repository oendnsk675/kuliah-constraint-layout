package com.example.tugasp5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    lateinit var berita2 : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        berita2 = findViewById<ImageButton>(R.id.banner_b2)
        berita2.setOnClickListener{
            val intent = Intent(this, DetailBerita::class.java)
            startActivity(intent)
        }
    }
}