package com.example.gamereminder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //get id and create view
        when(intent.getIntExtra("ID", 0)) {
            0 -> println("Ratchet And Clan")
            1 -> println("DeathLoop")
            2 -> println("Resident Evil")
            3 -> println("Mass Effect")
            4 -> println("Chivalry 2")
            5 -> println("Operation Tango")
            6 -> println("Mario Golf")
            7 -> println("Days Gone(PC)")


        }
    }


}
