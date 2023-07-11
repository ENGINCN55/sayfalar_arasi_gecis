package com.example.sayfalar_arasi_gecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sayfalar_arasi_gecis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonGoToB.setOnClickListener{
            val yeniIntent=Intent(this@MainActivity,MainActivity_b::class.java)
            yeniIntent.putExtra("mesaj","merhaba")
            yeniIntent.putExtra("yas",23)


            startActivity(yeniIntent)
        }


    }
}