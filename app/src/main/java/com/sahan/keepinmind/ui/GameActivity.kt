package com.sahan.keepinmind.ui

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sahan.keepinmind.R
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity(R.layout.activity_game), View.OnClickListener {

    private var tempTag = ""
    private var counter = 0
    private var tempId = 0
    private var flag = false
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

        if (view?.id == tempId) {
            view.setBackgroundResource(R.mipmap.ic_launcher_round)
            clear()
            return
        }

        if (flag) {
            return
        }

        checkCard(view!!)
        openCard(view)


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


    private fun checkCard(view: View) {

        if (counter == 1) {
            flag = true
            object : CountDownTimer(3000, 1000) {
                override fun onFinish() {
                    Toast.makeText(applicationContext, "onFinished", Toast.LENGTH_LONG).show()
                    checkCard2(view)
                }

                override fun onTick(millisUntilFinished: Long) {

                }

            }.start()
        } else {
            checkCard2(view)
        }


    }

    private fun checkCard2(view: View) {

        if (view.tag.toString() == tempTag) {
            view.visibility = View.INVISIBLE
            findViewById<ImageButton>(tempId).visibility = View.INVISIBLE
        } else {
            if (counter == 1) {
                view.setBackgroundResource(R.mipmap.ic_launcher_round)
                findViewById<ImageButton>(tempId).setBackgroundResource(R.mipmap.ic_launcher_round)
            }
        }

        tempTag = view.tag.toString()
        tempId = view.id
        counter++

        if (counter == 2) {
            clear()
        }


    }

    private fun clear() {
        counter = 0
        tempTag = ""
        flag = false
        tempId = 0
    }
}

