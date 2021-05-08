package com.example.gamereminder

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ArrayAdapter<*>

    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    private val gameNames = arrayOf("Ratchet And Clank: Rift Apart","DeathLoop","Resident Evil Village","Mass Effect Legendary Edition","Chivalry 2","Operation Tango","Mario Golf: Super Rush","Days Gone(PC)")
    private val gameDescription = arrayOf("Third Person PS5 Exclusive", "First Person PS5 Exclusive", "First Person Horror Game All Platforms", "Third Person RPG All Platforms","First Person Fighting Game All Platforms","Co Operative Puzzle Game All Platforms","Party Sports Game Switch Only","Third Person Survival Game PC Release" )
    private val gameImages = arrayOf(R.drawable.ratchet_and_clank,R.drawable.deathloop,R.drawable.resident_evil, R.drawable.mass_effect, R.drawable.chivalry_2_small, R.drawable.operation_tango, R.drawable.mario_golf_,R.drawable.days_gone_box)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv_recyclerView: RecyclerView = findViewById(R.id.rv_recyclerView)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, resources.getStringArray((R.array.gamenames_array)))



        postToList()

        rv_recyclerView.layoutManager = LinearLayoutManager(this)
        rv_recyclerView.adapter = RecyclerAdapter(titlesList, descList, imagesList)
    }
    private fun addToList(title: String, description: String, image: Int){
        titlesList.add(title)
        descList.add(description)
        imagesList.add(image)
    }

    private fun postToList(){
        for(i :Int in 1..gameNames.size){
            addToList(gameNames[i - 1], gameDescription[i-1], gameImages[i-1])
        }
    }




}

