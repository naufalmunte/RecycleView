package com.naufal.recycleview

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class hewan : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hewan)
        val lv_item = findViewById<ListView>(R.id.lvHewan)
        val namahewan = listOf("Gajah", "Kucing", "Semut", "Ayam" )

        val gambarHewanMap = mapOf(
            "Gajah" to R.drawable.gajah,
            "Kucing" to R.drawable.kucing,
            "Semut" to R.drawable.semut,
            "Ayam" to R.drawable.ayam,

        )
        lv_item.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namahewan)


        lv_item.setOnItemClickListener(){_, _, position, _ ->
            val selectedHewan = namahewan[position]
            Toast.makeText(this,"Anda memilih:$selectedHewan", Toast.LENGTH_SHORT).show()

            //intent ke detail activity

            val intent = Intent(this,detail_hewan::class.java)
            intent.putExtra("namaHewan",selectedHewan)
            intent.putExtra("gambarHewan",gambarHewanMap[selectedHewan] ?:0)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}