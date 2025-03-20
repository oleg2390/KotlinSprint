package org.example.lesson_7

fun main() {

    val range = 0..9
    val range2 = 'а'..'я'
    val resultPassword = StringBuilder()

    for (i in 0 until 6){
        if (i % 2 == 0){
            resultPassword.append(range2.random())
        }else{
            resultPassword.append(range.random())
        }
    }
    println(resultPassword)
}