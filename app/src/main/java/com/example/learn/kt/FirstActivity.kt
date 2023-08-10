package com.example.learn.kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learn.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
    }
}