package com.example.twomack.referenceapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuItem = findViewById<View>(R.id.HomeNav)
        menuItem.setBackgroundColor(getColor(R.color.white))


        val bottomNavigationView = findViewById<View>(R.id.bottom_navigation) as BottomNavigationView


        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.HomeNav -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true

                }
                R.id.PatternsNav -> {
                    val intent = Intent(this, UISamples::class.java)
                    startActivity(intent)
                    true
                }
                R.id.ScenariosNav -> {
                    val intent = Intent(this, ScenariosActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.InfoNav -> {
                    val intent = Intent(this, InfoActivity::class.java)
                    startActivity(intent)
                    true
                }

                else -> false
            }
        }
    }
}
