package com.naufal.recycleview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnHewan = findViewById<Button>(R.id.btnHewan)
        val btnBuah = findViewById<Button>(R.id.btnBuah)
        val btnMovie = findViewById<Button>(R.id.btnMovie)

        btnHewan.setOnClickListener {
            val Intent = Intent(this, hewan::class.java)
            startActivity(Intent)
        }

        btnBuah.setOnClickListener {
            val Intent = Intent(this, CustomImageRecycleView::class.java)
            startActivity(Intent)
        }

        btnMovie.setOnClickListener {
            val Intent = Intent(this, movie::class.java)
            startActivity(Intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}