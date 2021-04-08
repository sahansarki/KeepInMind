package com.sahan.keepinmind.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sahan.keepinmind.R
import com.sahan.keepinmind.enums.GameOption
import com.sahan.keepinmind.enums.ParamKey
import com.sahan.keepinmind.util.extChangeStatusColor
import com.sahan.keepinmind.util.extStartActivity
import kotlinx.android.synthetic.main.activity_dashboard.*


class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        this extChangeStatusColor android.R.color.holo_red_dark

        btnEasyGG.setOnClickListener {
            startGameActivity(GameOption.EASYGG)
        }

        btnEpic.setOnClickListener {
            startGameActivity(GameOption.EPIC)
        }

        btnMedium.setOnClickListener {
            startGameActivity(GameOption.MEDIUM)
        }

        btnHard.setOnClickListener {
            startGameActivity(GameOption.HARD)
        }


    }

    private fun startGameActivity(gameOption: GameOption) {
        val bundle = Bundle()
        bundle.putString(ParamKey.GAME_OPTION.name, gameOption.name)
        this.extStartActivity(GameActivity::class.java, bundle)
    }


}