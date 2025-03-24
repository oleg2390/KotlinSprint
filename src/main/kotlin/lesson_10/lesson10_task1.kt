package org.example.lesson_10

fun main() {

    val numUserRoll = rollOfDice()
    val numComputerRoll = rollOfDice()

    println("Игрок выбросил - $numUserRoll")
    println("Машина выбросила - $numComputerRoll")

    when {
        numUserRoll < numComputerRoll -> println("Победила машина")
        numUserRoll > numComputerRoll -> println("Победило человечество")
        else -> println("Победила дружба")
    }
}

fun rollOfDice(): Int = (1..6).random()