package com.example.acessoalimentar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acessoalimentar.databinding.ActivitySucessBinding

class SucessActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySucessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucess)

        binding = ActivitySucessBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sucessNavigation.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}