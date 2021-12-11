package com.example.dicodingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.util.Log
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), klik {
    private lateinit var RcyBarang: RecyclerView
    private var list: ArrayList<Barang> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RcyBarang = findViewById(R.id.Rcy_Barang)
        RcyBarang.setHasFixedSize(true)
        RcyBarang.layoutManager = LinearLayoutManager(this)
        list.addAll(DataBarang.data)
        val AdapterBarang = AdapterBarang(list,this)
        RcyBarang.adapter = AdapterBarang

        AdapterBarang.setOnItemClickCallback(object : AdapterBarang.OnItemClickCallback{
            override fun onItemClicked(barang: Barang) {
                showSelectedBarang(barang)
            }
        })


        var btmNavbar: BottomNavigationView = findViewById(R.id.btmNav)

        btmNavbar.setSelectedItemId(R.id.home)

        btmNavbar.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.home ->{
                    val pindahHome = Intent(this, MainActivity::class.java)
                    startActivity(pindahHome)
                }

                R.id.profile ->{
                    val pindahProfile = Intent(this, HalProfile::class.java)
                    startActivity(pindahProfile)
                }
            }
            true
        }
    }

    private fun showSelectedBarang(barang: Barang) {
        Toast.makeText(this, "Kamu memilih " + barang.NamaBarang, Toast.LENGTH_SHORT).show()
    }

    override fun onBarangClick(position: Int) {



        val Intent = Intent(this, HalDetail::class.java)
        Intent.putExtra("harga",list[position].harga)
        Intent.putExtra("Deskripsi",list[position].Deskripsi)
        Intent.putExtra("foto",list[position].Foto)

        startActivity(Intent)
    }


}