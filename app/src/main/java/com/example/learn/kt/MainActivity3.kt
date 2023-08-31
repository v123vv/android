package com.example.learn.kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.learn.R
import com.example.learn.databinding.ActivityMain2Binding
import com.example.learn.databinding.ActivityMain3Binding
import java.lang.StringBuilder

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding
    private val fruitList = ArrayList<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initFruits() // 初始化水果数据

        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerView.layoutManager = layoutManager
        val adapter = FruitAdapter(fruitList)
        binding.recyclerView.adapter = adapter
    }


    private fun initFruits(){
        repeat(2){
            fruitList.add(Fruit(getRandomLengthString("Apple"), R.drawable.img_1))
            fruitList.add(Fruit(getRandomLengthString("Banana"), R.drawable.img_2))
            fruitList.add(Fruit(getRandomLengthString("Orange"), R.drawable.img_1))
            fruitList.add(Fruit(getRandomLengthString("Watermelon"), R.drawable.img_2))
            fruitList.add(Fruit(getRandomLengthString("Pear"), R.drawable.img_1))
            fruitList.add(Fruit(getRandomLengthString("Strawberry"), R.drawable.img_2))
            fruitList.add(Fruit(getRandomLengthString("Pineapple"), R.drawable.img_1))
            fruitList.add(Fruit(getRandomLengthString("Grape"), R.drawable.img_2))
            fruitList.add(Fruit(getRandomLengthString("Cherry"), R.drawable.img_1))
            fruitList.add(Fruit(getRandomLengthString("Mango"), R.drawable.img_2))
        }
    }

    private fun getRandomLengthString(str: String):String {
        val n = (1..20).random()
        val builder = StringBuilder()
        repeat(n){
            builder.append(str)
        }
        return builder.toString()
    }
}