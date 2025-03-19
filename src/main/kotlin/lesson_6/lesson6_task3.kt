package org.example.lesson_6

fun main() {
    println("количество секунд, которые нужно засечь?")
    var userInput = readln().toInt()

    var timer = userInput

    while (timer > 0) {
        timer--
        Thread.sleep(1000)
        println("Осталось секунд $timer")
    }
    println("Время вышло")
}