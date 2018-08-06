package com.darvishiyan.strings

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.widget.TextView


class SpannableFlagExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.spannable_flag_example_activity)

        val tv01: TextView = findViewById(R.id.tv01)
        val tv02: TextView = findViewById(R.id.tv02)
        val tv03: TextView = findViewById(R.id.tv03)
        val tv04: TextView = findViewById(R.id.tv04)
        val tv05: TextView = findViewById(R.id.tv05)
        val tv06: TextView = findViewById(R.id.tv06)
        val tv07: TextView = findViewById(R.id.tv07)
        val tv08: TextView = findViewById(R.id.tv08)

        val myString = "01234"
        val start = 1
        val end = 3

        var spannableString = SpannableStringBuilder(myString)
        spannableString.setSpan(ForegroundColorSpan(Color.RED), start, end, Spannable.SPAN_INCLUSIVE_INCLUSIVE)
        tv01.text = spannableString
        spannableString.setSpan(ForegroundColorSpan(Color.RED), start, end, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        tv02.text = spannableString
        spannableString.setSpan(ForegroundColorSpan(Color.RED), start, end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        tv03.text = spannableString
        spannableString.setSpan(ForegroundColorSpan(Color.RED), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv04.text = spannableString

        spannableString.setSpan(ForegroundColorSpan(Color.RED), start, end, Spannable.SPAN_INCLUSIVE_INCLUSIVE)
        spannableString.insert(end, "x")
        spannableString.insert(start, "x")
        tv05.text = spannableString

        spannableString = SpannableStringBuilder(myString)
        spannableString.setSpan(ForegroundColorSpan(Color.RED), start, end, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        spannableString.insert(end, "x")
        spannableString.insert(start, "x")
        tv06.text = spannableString

        spannableString = SpannableStringBuilder(myString)
        spannableString.setSpan(ForegroundColorSpan(Color.RED), start, end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannableString.insert(end, "x")
        spannableString.insert(start, "x")
        tv07.text = spannableString

        spannableString = SpannableStringBuilder(myString)
        spannableString.setSpan(ForegroundColorSpan(Color.RED), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.insert(end, "x")
        spannableString.insert(start, "x")
        tv08.text = spannableString
    }

}
