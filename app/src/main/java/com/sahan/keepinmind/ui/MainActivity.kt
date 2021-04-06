package com.sahan.keepinmind.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sahan.keepinmind.R
import com.sahan.keepinmind.util.extChangeStatusColor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        this extChangeStatusColor android.R.color.holo_red_dark
    }
}