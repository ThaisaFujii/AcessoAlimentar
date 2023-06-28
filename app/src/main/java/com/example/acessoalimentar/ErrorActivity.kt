package com.example.acessoalimentar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acessoalimentar.databinding.ActivityErrorBinding

class ErrorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityErrorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)

        binding = ActivityErrorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.errorNavigation.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}