package com.example.learn.kt

class Student(val sno: String ,val grade: Int) : Person(){
    init {
        println("sno is "+ sno)
        println("grade is "+ grade)
    }
}