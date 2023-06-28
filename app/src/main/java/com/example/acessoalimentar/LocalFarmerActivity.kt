package com.example.acessoalimentar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acessoalimentar.databinding.ActivityLocalFarmerBinding

class LocalFarmerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocalFarmerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_farmer)

        binding = ActivityLocalFarmerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener {
            var intent = Intent(this, LocalFarmerEditActivity::class.java)
            startActivity(intent)
        }
    }
}