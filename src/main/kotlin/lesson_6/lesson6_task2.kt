package org.example.lesson_6

fun main() {
    println("количество секунд, которые нужно засечь?")
    var userInput = readln().toInt()

    var timer = userInput
    timer--
    Thread.sleep(1000)

    println("Прошло $userInput секунд")
}