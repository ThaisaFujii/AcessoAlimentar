package com.example.acessoalimentar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acessoalimentar.databinding.ActivityMainHomeBinding

class MainHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home)
        binding = ActivityMainHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.agricultorLocal.setOnClickListener {
            var intent = Intent(this, LocalFarmerListActivity::class.java)
            startActivity(intent)
        }
        binding.homeProfile.setOnClickListener {
            var intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}