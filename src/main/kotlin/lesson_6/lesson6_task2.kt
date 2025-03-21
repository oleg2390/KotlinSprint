package org.example.lesson_6

const val TIMER = 1000
fun main() {
    println("количество секунд, которые нужно засечь?")
    var userInput = readln().toInt()

    var timer = userInput * TIMER
    Thread.sleep(timer.toLong())

    println("Прошло $userInput секунд")
}