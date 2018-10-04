package com.example.twomack.referenceapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_uisamples.*

class ScenariosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scenarios)

        val menuItem = findViewById<View>(R.id.ScenariosNav)
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

        val uiExamples = arrayListOf<String>("Barcode Scanner", "Printing", "Bing Maps", "Push Notifications", "Take a picture", "Retrieve Data from the Network", "Upload a picture", "Single Sign On", "Store Finder")

        UIRecyclerView.layoutManager = LinearLayoutManager(this)
        UIRecyclerView.adapter = UIListRecyclerViewAdapter(uiExamples, this)


    }
}
