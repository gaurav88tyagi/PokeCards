package com.example.pokecards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.dingmouren.layoutmanagergroup.echelon.EchelonLayoutManager
import com.dingmouren.layoutmanagergroup.skidright.SkidRightLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cards = genNRandomCards(100)

        rvCards.layoutManager = EchelonLayoutManager(this)

//        rvCards.layoutManager = SkidRightLayoutManager(1.0F, 1.2F)

//        rvCards.layoutManager = GridLayoutManager(
//            this,
//            2,
//            GridLayoutManager.VERTICAL,
//            false
//        )

        rvCards.adapter = CardAdapter(cards)

    }
}
