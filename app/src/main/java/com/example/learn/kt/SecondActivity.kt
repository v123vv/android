package com.example.learn.kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.OnBackPressedCallback
import com.example.learn.R
import com.example.learn.databinding.ActivitySecondBinding
import com.example.learn.databinding.FirstLayoutBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button2.setOnClickListener {
            val intent = Intent()
            intent.putExtra("data_return", "Hello 1")
            setResult(RESULT_OK,intent)
            finish()
        }

        val callback = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                val intent = Intent()
                intent.putExtra("data_return", "Hello 1")
                setResult(RESULT_OK,intent)
                finish()
            }
        }
        onBackPressedDispatcher.addCallback(this, callback)
    }


}