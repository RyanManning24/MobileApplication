package com.example.gamereminder

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        when(intent.getIntExtra("ID", 0)) {
            0 -> Load1()
            1 -> Load2()
            2 -> Load3()
            3 -> Load4()
            4 -> Load5()
            5 -> Load6()
            6 -> Load7()
            7 -> Load8()


        }
    }

    private fun Load1() {

        val logo: ImageView? = findViewById(R.id.imageView)
        logo?.setImageResource(R.drawable.ratchet_and_clank_big)

        val screenshot: ImageView? = findViewById(R.id.imageView2)
        screenshot?.setImageResource(R.drawable.ratchet_and_clank_screenshot)

        val gameName: TextView? = findViewById(R.id.textView)
        gameName?.text = "Ratchet And Clank"

        val gameDesc: TextView? = findViewById(R.id.textView2)
        gameDesc?.text = "Ratchet & Clank: Rift Apart is an upcoming third-person shooter platform game.Ratchet & Clank: Rift Apart will explore the story of the titular characters as they traverse across different worlds in multiple realities to stop their archenemy, Doctor Nefarious, from exploiting the catastrophic dimensional collapse to finally achieve his dream of completely exterminating organic life in all universes.The game will be released on June 11, 2021."
    }

    private fun Load2() {

        val logo: ImageView? = findViewById(R.id.imageView)
        logo?.setImageResource(R.drawable.deathloop_big)

        val screenshot: ImageView? = findViewById(R.id.imageView2)
        screenshot?.setImageResource(R.drawable.deathloop_gameplay_image)

        val gameName: TextView? = findViewById(R.id.textView)
        gameName?.text = "Deathloop"

        val gameDesc: TextView? = findViewById(R.id.textView2)
        gameDesc?.text ="Deathloop has the player in the role of Colt, an assassin that is stuck in a time loop, waking up on a beach at the island of Blackreef. The other residents of Blackreef, a former army base where strange experiments had once been held, have invested in the island and have gathered for this night to hold a party that seemingly lasts forever, as at the end of each night, the island resets to the start of the party in that time loop.To be released 04/09/21"

    }

    private fun Load3() {
        val logo: ImageView? = findViewById(R.id.imageView)
        logo?.setImageResource(R.drawable.resident_evil_big)

        val screenshot: ImageView? = findViewById(R.id.imageView2)
        screenshot?.setImageResource(R.drawable.resident_evil_8_village_screenshot)

        val gameName: TextView? = findViewById(R.id.textView)
        gameName?.text = "Resident Evil Village"

        val gameDesc: TextView? = findViewById(R.id.textView2)
        gameDesc?.text = "Resident Evil Village is a survival horror game developed and published by Capcom. A major installment in the Resident Evil series and a narrative sequel to 2017's Resident Evil 7: Biohazard,[1] the game follows Ethan Winters, who, after a fateful encounter with Chris Redfield, finds himself in a village filled with mutant creatures in an effort to find his kidnapped daughter. To be released 07/05/21"

    }

    private fun Load4() {
        val logo: ImageView? = findViewById(R.id.imageView)
        logo?.setImageResource(R.drawable.mass_effect_big)

        val screenshot: ImageView? = findViewById(R.id.imageView2)
        screenshot?.setImageResource(R.drawable.mass_effect_screenshot)

        val gameName: TextView? = findViewById(R.id.textView)
        gameName?.text = "Mass Effect Legendary Edition"

        val gameDesc: TextView? = findViewById(R.id.textView2)
        gameDesc?.text = "Mass Effect Legendary Edition is a compilation of the video games in the Mass Effect trilogy: Mass Effect, Mass Effect 2, and Mass Effect 3. It is being developed by BioWare with assistance from Abstraction Games and Blind Squirrel Games, and published by Electronic Arts. All three games were remastered, with visual enhancements, technical improvements, and gameplay adjustments.To be released 14/05/21 "

    }
    private fun Load5() {
        val logo: ImageView? = findViewById(R.id.imageView)
        logo?.setImageResource(R.drawable.chivalry_2_big)

        val screenshot: ImageView? = findViewById(R.id.imageView2)
        screenshot?.setImageResource(R.drawable.chivalry_2_screenshots)

        val gameName: TextView? = findViewById(R.id.textView)
        gameName?.text = "Chivalry 2"

        val gameDesc: TextView? = findViewById(R.id.textView2)
        gameDesc?.text = "Chivalry 2 is a multiplayer first-person slasher inspired by epic medieval movie battles. Players are thrust into the action of every iconic moment of the era – from the thunder of cavalry charges, to storms of flaming arrows, sprawling castle sieges, and more.To be released 08/06/21"

    }

    private fun Load6() {
        val logo: ImageView? = findViewById(R.id.imageView)
        logo?.setImageResource(R.drawable.operation_tango_big)

        val screenshot: ImageView? = findViewById(R.id.imageView2)
        screenshot?.setImageResource(R.drawable.tango_screenshot_)

        val gameName: TextView? = findViewById(R.id.textView)
        gameName?.text = "Operation Tango"

        val gameDesc: TextView? = findViewById(R.id.textView2)
        gameDesc?.text = "Co-op puzzle solving - combine skill sets from different points of view to overcome asymmetrical challenges. These missions cannot be completed alone.Planned release date 01/06/21"

    }

    private fun Load7() {
        val logo: ImageView? = findViewById(R.id.imageView)
        logo?.setImageResource(R.drawable.mario_golf_big)

        val screenshot: ImageView? = findViewById(R.id.imageView2)
        screenshot?.setImageResource(R.drawable.mario_screenshot)

        val gameName: TextView? = findViewById(R.id.textView)
        gameName?.text = "Mario Golf: Super Rush"

        val gameDesc: TextView? = findViewById(R.id.textView2)
        gameDesc?.text = "Mario Golf Super Rush is an upcoming golf video game.The gameplay features various characters from the Mario franchise competing in the sport golf, with regular competition and other modes. The game was announced via a Nintendo Direct in February 2021 and it is set to be released worldwide on June 25, 2021."

    }
    private fun Load8() {
        val logo: ImageView? = findViewById(R.id.imageView)
        logo?.setImageResource(R.drawable.days_gone_box_big)

        val screenshot: ImageView? = findViewById(R.id.imageView2)
        screenshot?.setImageResource(R.drawable.days_gone_screenshot)

        val gameName: TextView? = findViewById(R.id.textView)
        gameName?.text = "Days Gone (PC)"

        val gameDesc: TextView? = findViewById(R.id.textView2)
        gameDesc?.text = "Days Gone is a action-adventure survival horror video game. Set in a post-apocalyptic Oregon two years after the start of a global pandemic, former outlaw-turned-drifter Deacon St. John discovers the possibility of his wife Sarah still being alive, which leads Deacon on a quest to find her. To be released 18/05/21"

    }

}