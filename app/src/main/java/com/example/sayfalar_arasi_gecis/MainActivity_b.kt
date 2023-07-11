package com.example.sayfalar_arasi_gecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sayfalar_arasi_gecis.databinding.ActivityMainB2Binding
import kotlin.math.log

class MainActivity_b : AppCompatActivity() {
    private lateinit var binding: ActivityMainB2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_b2)
        binding=ActivityMainB2Binding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        binding.buttonGoToC.setOnClickListener {
            val yeniIntent=Intent(this@MainActivity_b,MainActivityC::class.java)
            val gelenMNesaj=intent.getStringExtra("mesaj")
            val gelenYas=intent.getIntExtra("yas",0)
            Log.e("MESAJ",gelenMNesaj.toString())
            Log.e("YAŞ", gelenYas.toString())


            startActivity(yeniIntent)
        }
    }
}