package com.example.sayfalar_arasi_gecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalar_arasi_gecis.databinding.ActivityMainCBinding

class MainActivityC : AppCompatActivity() {
    private lateinit var binding: ActivityMainCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_c)
        val binding=ActivityMainCBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        binding.goD.setOnClickListener {
            val yeniIntent=Intent(this@MainActivityC,MainActivity_d::class.java)
            startActivity(yeniIntent)
        }
    }
}