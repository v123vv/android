package com.example.learn.kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.learn.R
import com.example.learn.databinding.ActivityMainBinding

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
                AlertDialog.Builder(this).apply {
                    setTitle("This is Dialog")
                    setMessage("Something important")
                    setCancelable(false)
                    setPositiveButton("ok"){ _, _ ->}
                    setNegativeButton("Cancel"){ _, _ ->}
                    show()
                }

            }
        }
    }
}