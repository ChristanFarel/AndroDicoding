package com.example.dicodingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class HalDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_detail)

        val harga = intent.getStringExtra("harga")
        val desk = intent.getStringExtra("Deskripsi")


        val txtDesk: TextView = findViewById(R.id.fullDesc)
        val txtHarga: TextView = findViewById(R.id.harga)
        val foto: ImageView = findViewById(R.id.gmbrBarang)

        val b: Bundle? = getIntent().extras
        val gambar = b?.getInt("foto")
        if (gambar != null) {
            foto.setImageResource(gambar)
        }


        txtHarga.text = harga.toString()
        txtDesk.text = desk.toString()

    }
}