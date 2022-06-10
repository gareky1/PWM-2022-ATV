package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickListener()

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottNavigation)
        setupWithNavController(bottomNavigationView, navController)
    }
    public fun clickListener(){
        var part1 = findViewById<ImageView>(R.id.part1)
        var part2 = findViewById<ImageView>(R.id.part2)
        var part3 = findViewById<ImageView>(R.id.part3)

        part1.setOnClickListener {

            openTela1Activity()
        }
        part2.setOnClickListener {
            openTela2Activity()
        }
        part3.setOnClickListener {
            openTela3Activity()
        }


    }

    public fun openTela1Activity(){
        startActivity(Intent(this@MainActivity,Tela1::class.java))
    }
    public fun openTela2Activity(){
        startActivity(Intent(this@MainActivity,Tela2::class.java))
    }
    public fun openTela3Activity(){
        startActivity(Intent(this@MainActivity,Tela3::class.java))
    }
}


