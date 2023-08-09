package com.example.learn.kt

fun main(){
    val student = Student("123",34)
    val p = Person()
    p.name = "Jack"
    p.age = 19
    p.eat()


    //print( largerNumber(234,53))
    //print(getScore1("jim"))
    /*val num = 10L
    checkNumber(num)*/

   /* for (i in 0..10){
        println(i)
    }
    for (i in 0 until 10 step 2){
        println(i)
    }*/

    /*for (i in 10 downTo(1) step 5){
        println(i)
    }*/
}



    fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

    fun getScore(name: String) = if (name == "Tom"){
        86
    }else if (name == "jim"){
        77
    }else if (name == "Jack"){
        95
    }else if (name == "Lily"){
        100
    }else{
        0
    }
fun getScore1(name: String) = when(name){
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 100
    else -> 0
}

fun checkNumber(number: Number){
    when(number){
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}