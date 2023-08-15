package com.example.lat3_if9_10120761_muhamadrizankarindra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val message = intent.getStringExtra("theMessage")

        val textView = findViewById<TextView>(R.id.textView)
        textView.apply {
            text = message
        }
    }
}