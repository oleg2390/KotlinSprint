package org.example.lesson_10

fun main() {

    var winResultUser = 0

    do {
        if (playRound()) {
            winResultUser++
        }
        println("Играем дальше?")
        val userInput = readln().toString()
    } while (userInput == "да")

    println(winResultUser)
}

fun rollCube(): Int {
    return (1..6).random()
}

fun playRound(): Boolean {

    val userRoll = rollCube()
    println("Игрок бросил $userRoll")

    val compRoll = rollCube()
    println("Машина бросила $compRoll")

    return when {

        userRoll == compRoll -> {
            println("Победила дружба")
            false
        }

        userRoll > compRoll -> {
            println("Человечество победило")
            true
        }

        else -> {
            println("Машина победила")
            false
        }
    }
}