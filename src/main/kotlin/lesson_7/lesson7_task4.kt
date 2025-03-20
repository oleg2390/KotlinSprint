package org.example.lesson_7

fun main() {

    println("Введите время таймера")
    val userInputNumberTimer = readln().toInt()

    for (i in userInputNumberTimer downTo 0) {
        println("Осталось $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}