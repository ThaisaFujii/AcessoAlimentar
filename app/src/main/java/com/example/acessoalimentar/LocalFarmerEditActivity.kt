package com.example.acessoalimentar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acessoalimentar.databinding.ActivityLocalFarmerEditBinding

class LocalFarmerEditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocalFarmerEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_farmer_edit)

        binding = ActivityLocalFarmerEditBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener {
            var intent = Intent(this, MainHomeActivity::class.java)
            startActivity(intent)
        }
        binding.imageView2.setOnClickListener {
            var intent = Intent(this, ErrorActivity::class.java)
            startActivity(intent)
        }
    }
}