package com.sahan.keepinmind.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sahan.keepinmind.R
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity(R.layout.activity_game), View.OnClickListener {

    private var tempTag = ""
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        card1.setOnClickListener(this)
        card2.setOnClickListener(this)
        card3.setOnClickListener(this)
        card4.setOnClickListener(this)
        card5.setOnClickListener(this)
        card6.setOnClickListener(this)
        card7.setOnClickListener(this)
        card8.setOnClickListener(this)
        card9.setOnClickListener(this)
        card10.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        openCard(view!!)

        if (view.tag.toString() == tempTag) {
            view.visibility = View.INVISIBLE
            view.visibility = View.INVISIBLE
        } else {
            if (counter == 1) {
                view.setBackgroundResource(R.mipmap.ic_launcher_round)
                view.setBackgroundResource(R.mipmap.ic_launcher_round)
            }
        }

        tempTag = view.tag.toString()
        counter++
    }

    private fun openCard(view: View) {
        when (view.tag.toString()) {
            "flag_ad" -> {
                view.setBackgroundResource(R.drawable.flag_ax)
            }
            "flag_am" -> {
                view.setBackgroundResource(R.drawable.flag_ad)
            }
            "flag_bq" -> {
                view.setBackgroundResource(R.drawable.flag_am)
            }
            "flag_bq" -> {
                view.setBackgroundResource(R.drawable.flag_bq)
            }
            "flag_bj" -> {
                view.setBackgroundResource(R.drawable.flag_bj)
            }
            "flag_bb" -> {
                view.setBackgroundResource(R.drawable.flag_bb)
            }
        }
    }
}