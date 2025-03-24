package org.example.lesson_10

fun main() {

    val userScore = rollsDice()
    println("Игрок выбросил $userScore")
    val computerScore = rollsDice()
    println("Машина выбросила $computerScore")

    when {
        userScore == computerScore -> println("Победила дружба")
        userScore > computerScore -> println("Победило человечество")
        else -> println("Победила машина")
    }
}

fun rollsDice(): Int = (1..6).random()