package com.example.telasobre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickListener()
    }

    public fun clickListener(){
        var imageHenrique = findViewById<ImageView>(R.id.henrique)
        var imageCongelamento = findViewById<ImageView>(R.id.congelamento)
        var imageExplosao = findViewById<ImageView>(R.id.explosao)
        var imageTristeza = findViewById<ImageView>(R.id.tristeza)

        imageCongelamento.setOnClickListener {

            openCongelamentoActivity()
        }
        imageHenrique.setOnClickListener {
            openHenriqueActivity()
        }
        imageExplosao.setOnClickListener {
            openExplosaoActivity()
        }
        imageTristeza.setOnClickListener {
            openTristezaActivity()
        }
    }
    public fun openHenriqueActivity(){
        startActivity(Intent(this@MainActivity,Henrique::class.java))
    }
    public fun openCongelamentoActivity(){
        startActivity(Intent(this@MainActivity,Congelamento::class.java))
    }
    public fun openExplosaoActivity(){
        startActivity(Intent(this@MainActivity,Explosao::class.java))
    }
    public fun openTristezaActivity(){
        startActivity(Intent(this@MainActivity,Tristeza::class.java))
    }
}