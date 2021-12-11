package com.example.dicodingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class HalProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_profile)

        var btmNavbar: BottomNavigationView = findViewById(R.id.btmNav)
        btmNavbar.setSelectedItemId(R.id.profile)

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
}