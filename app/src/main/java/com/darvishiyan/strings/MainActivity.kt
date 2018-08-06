package com.darvishiyan.strings

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)
    }

    fun openSpannableExample(view: View) {
        startActivity(Intent(this, SpannableExampleActivity::class.java))
    }

    fun openSpannableFlagExample(view: View) {
        startActivity(Intent(this, SpannableFlagExampleActivity::class.java))
    }
}