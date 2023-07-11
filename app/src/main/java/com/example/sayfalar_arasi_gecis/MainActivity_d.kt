package com.example.sayfalar_arasi_gecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalar_arasi_gecis.databinding.ActivityMainB2Binding
import com.example.sayfalar_arasi_gecis.databinding.ActivityMainDBinding

class MainActivity_d : AppCompatActivity() {
    private lateinit var binding: ActivityMainDBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_d)
        binding= ActivityMainDBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }

    override fun onBackPressed() {
        val intent=Intent(this@MainActivity_d,MainActivity_b::class.java)
        startActivity(intent)
    }
}