package com.darvishiyan.strings

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.*
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast


class SpannableExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val styledString = SpannableString(
                "Large\n\n"            // index 0 - 5
                        + "Bold\n\n"          // index 7 - 11
                        + "Underlined\n\n"    // index 13 - 23
                        + "Italic\n\n"        // index 25 - 31
                        + "Strikethrough\n\n" // index 33 - 46
                        + "Colored\n\n"       // index 48 - 55
                        + "Highlighted\n\n"   // index 57 - 68
                        + "K Superscript\n\n" // "Superscript" index 72 - 83
                        + "K Subscript\n\n"   // "Subscript" index 87 - 96
                        + "Url\n\n"           //  index 98 - 101
                        + "Clickable\n\n"     // index 103 - 112
        )

        // make the text twice as large
        styledString.setSpan(RelativeSizeSpan(2f), 0, 5, 0)

        // make text bold
        styledString.setSpan(StyleSpan(Typeface.BOLD), 7, 11, 0)

        // underline text
        styledString.setSpan(UnderlineSpan(), 13, 23, 0)

        // make text italic
        styledString.setSpan(StyleSpan(Typeface.ITALIC), 25, 31, 0)

        styledString.setSpan(StrikethroughSpan(), 33, 46, 0)

        // change text color
        styledString.setSpan(ForegroundColorSpan(Color.GREEN), 48, 55, 0)

        // highlight text
        styledString.setSpan(BackgroundColorSpan(Color.CYAN), 57, 68, 0)

        // superscript
        styledString.setSpan(SuperscriptSpan(), 72, 83, 0)

        // make the superscript text smaller
        styledString.setSpan(RelativeSizeSpan(0.5f), 72, 83, 0)

        // subscript
        styledString.setSpan(SubscriptSpan(), 87, 96, 0)

        // make the subscript text smaller
        styledString.setSpan(RelativeSizeSpan(0.5f), 87, 96, 0)

        // url
        styledString.setSpan(URLSpan("https://www.linkedin.com/in/darvishiyan"), 98, 101, 0)

        // clickable text
        val clickableSpan = object : ClickableSpan() {

            override fun onClick(view: View?) {
                Toast.makeText(this@SpannableExampleActivity, "Clicked", Toast.LENGTH_SHORT).show()
            }

        }

        styledString.setSpan(clickableSpan, 103, 112, 0)


        val textView = TextView(this)
        textView.movementMethod = LinkMovementMethod.getInstance()
        textView.gravity = Gravity.CENTER
        textView.setBackgroundColor(Color.WHITE)
        textView.text = styledString
        setContentView(textView)
    }


}
