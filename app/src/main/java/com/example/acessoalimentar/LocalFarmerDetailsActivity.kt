package com.example.acessoalimentar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acessoalimentar.databinding.ActivityLocalFarmerDetailsBinding

class LocalFarmerDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocalFarmerDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_farmer_details)
        binding = ActivityLocalFarmerDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.localFarmerNavigation.setOnClickListener {
            var intent = Intent(this, LocalFarmerListActivity::class.java)
            startActivity(intent)
        }
    }
}