package org.example.lesson_7

fun main() {

    println("Введите число")
    val numberUser = readln().toInt()
    val range = 0..numberUser
    val sortRange = range.filter { it % 2 == 0 }
    println(sortRange)
}