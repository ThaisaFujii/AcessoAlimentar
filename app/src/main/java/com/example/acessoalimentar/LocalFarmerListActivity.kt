package com.example.acessoalimentar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acessoalimentar.databinding.ActivityLocalFarmerListBinding

class LocalFarmerListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocalFarmerListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_farmer_list)
        binding = ActivityLocalFarmerListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.listNavigation.setOnClickListener {
            var intent = Intent(this, MainHomeActivity::class.java)
            startActivity(intent)
        }
        binding.firstName.setOnClickListener {
            var intent = Intent(this, LocalFarmerDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}