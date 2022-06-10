package com.example.telasobre

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Henrique : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_henrique)


        val imgOpenURL: ImageView = findViewById(R.id.instagram)
        imgOpenURL.setOnClickListener {
            val openURL= Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.instagram.com/heim_rikl/")

            startActivity(openURL)
        }


        val imgOpenURL2: ImageView = findViewById(R.id.github)
        imgOpenURL2.setOnClickListener {
            val openURL2= Intent(Intent.ACTION_VIEW)
            openURL2.data= Uri.parse("https://github.com/gareky1")

            startActivity(openURL2)
        }
    }
}