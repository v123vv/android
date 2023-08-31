package com.example.learn.kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.learn.R
import com.example.learn.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initFruits()

        binding.listView.setOnItemClickListener { _, _, position, _ ->
            val fruit = fruitList[position]
            Toast.makeText(this, fruit.name, Toast.LENGTH_SHORT).show()
        }
    }

    private fun initFruits(){
        repeat(2){
            fruitList.add(Fruit("Apple", R.drawable.img_1))
            fruitList.add(Fruit("Banana", R.drawable.img_2))
            fruitList.add(Fruit("Orange", R.drawable.img_1))
            fruitList.add(Fruit("Watermelon", R.drawable.img_2))
            fruitList.add(Fruit("Pear", R.drawable.img_1))
            fruitList.add(Fruit("Strawberry", R.drawable.img_2))
            fruitList.add(Fruit("Pineapple", R.drawable.img_1))
            fruitList.add(Fruit("Grape", R.drawable.img_2))
            fruitList.add(Fruit("Cherry", R.drawable.img_1))
            fruitList.add(Fruit("Mango", R.drawable.img_2))
        }
    }
}