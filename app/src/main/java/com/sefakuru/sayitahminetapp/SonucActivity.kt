package com.sefakuru.sayitahminetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sefakuru.sayitahminetapp.databinding.ActivitySonucBinding

class SonucActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySonucBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_sonuc)

        val sonuc=intent.getBooleanExtra("sonuc",false)
        if(sonuc){
            binding.textViewSonuc.text="KAZANDINIZ :)"
            binding.imageView.setImageResource(R.drawable.mutlu_resim)
        }else{
            binding.textViewSonuc.text="KAYBETTİNİZ:("
            binding.imageView.setImageResource(R.drawable.uzgun_resim)

        }

        binding.buttonTekrarOyna.setOnClickListener {
            val intent=Intent(this@SonucActivity,TahminnActivity::class.java)
            finish()
            startActivity(intent)

        }
    }
}