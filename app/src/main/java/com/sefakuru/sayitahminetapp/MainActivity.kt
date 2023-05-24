package com.sefakuru.sayitahminetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sefakuru.sayitahminetapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.buttonBasla.setOnClickListener {

            val intent=Intent(this@MainActivity,TahminnActivity::class.java)

            startActivity(intent)
        }
    }
}