package com.example.learn.kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.learn.R
import com.example.learn.databinding.ActivityMainBinding
import com.example.learn.databinding.FirstLayoutBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", this.toString())
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button -> {
                Log.d("MainActivity","点击了按钮")
                Toast.makeText(this,"点击了按钮", Toast.LENGTH_SHORT).show()
            }
        }
    }
}