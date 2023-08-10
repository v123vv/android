package com.example.learn.kt

fun doStudy(study: Study?){
    study?.let {
        it.readBooks()
        it.doHomework()
    }

}
fun main(){

    Thread{
        println("Thread is running")
    }.start()

    /*val list = listOf("Apple","Banana","Orange","Pear","Watermelon")
    val newList = list.filter { it.length <= 5 }.map { it.uppercase() }
    for (a in newList){
        println(a)
    }*/
    /*val map = HashMap<String, Int>()
    map["Apple"] = 1
    map["a"] = 2
    map["b"] = 3
    println(map["b"] )

    for ((k,v) in map){
        println("key is $k value = $v")
    }*/
    /*val list1 = mutableListOf("Apple","Xiaomi","Samsung","Huawei")
    list1.add("OPPO")
    for (fruit in list1){
        println(fruit)
    }
*/

   /* val cellphone1 = Cellphone("Samsung", 1399.99)
    val cellphone2 = Cellphone("Samsung", 1399.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 "+ (cellphone1 == cellphone2))*/


 /*   val student = Student("Jack",18)
    println(student.eat())
    doStudy(student)
*/
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