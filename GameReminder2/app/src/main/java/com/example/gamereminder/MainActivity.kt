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
        for(i :Int in 1..25){
            addToList("Title $i", "Description $i", R.mipmap.ic_launcher_round)
        }
    }
}