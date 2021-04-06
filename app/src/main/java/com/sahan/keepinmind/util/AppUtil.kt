package com.sahan.keepinmind.util

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.ColorRes
import androidx.appcompat.app.AppCompatActivity

//Sahan

infix fun <ClassName> Context.extStartActivity(cls: Class<ClassName>) {
    startActivity(Intent(this, cls))
}

infix fun AppCompatActivity.extChangeStatusColor(@ColorRes id: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        window.statusBarColor = resources.getColor(id, this.theme)
    } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.statusBarColor = resources.getColor(id)
    }
}