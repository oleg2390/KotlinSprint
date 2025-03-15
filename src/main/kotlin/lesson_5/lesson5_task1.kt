package org.example.lesson_5

const val FIRST_NUMBER = 5
const val SECOND_NUMBER = 6
fun main () {
    println("сложите два числа $FIRST_NUMBER и $SECOND_NUMBER")

    val numberUser = readln().toInt()

    if (numberUser == (FIRST_NUMBER + SECOND_NUMBER)){
        println("Добро пожаловать!")
    }else{
        println("Доступ запрещен")
    }

}