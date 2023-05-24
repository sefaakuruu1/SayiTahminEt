package com.sefakuru.sayitahminetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.sefakuru.sayitahminetapp.databinding.ActivityTahminnBinding
import kotlin.random.Random

class TahminnActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTahminnBinding
    val randomSayi= Random.nextInt(101)

    var sayac=5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_tahminn)
        Log.e("random",randomSayi.toString())

        binding.buttonGonder.setOnClickListener {

           var gelenSayi=binding.editTextNumber.text.toString().toInt()

           sayac--

            if(randomSayi==gelenSayi) {
                val intent=Intent(this@TahminnActivity,SonucActivity::class.java)
                intent.putExtra("sonuc",true)
                finish()
                startActivity(intent)
                return@setOnClickListener


            }
            if(gelenSayi<randomSayi){
                binding.textViewSayiYardim.text="Arttır"
                binding.textViewKalanHak.text="kalan hak:${sayac}"


            }
            if(randomSayi <gelenSayi){
                binding.textViewSayiYardim.text="Azalt"
                binding.textViewKalanHak.text="kalan hak:${sayac}"
            }

            if(sayac==0){
                val intent=Intent(this@TahminnActivity,SonucActivity::class.java)
                intent.putExtra("sonuc",false)
                finish()
                startActivity(intent)
            }
           binding.editTextNumber.setText("")

        }
    }
}