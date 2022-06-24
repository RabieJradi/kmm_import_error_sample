package com.example.import_error_sample.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.import_error_sample.SharedGreeting
import android.widget.TextView

fun greet(): String {
    return SharedGreeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
    }
}
