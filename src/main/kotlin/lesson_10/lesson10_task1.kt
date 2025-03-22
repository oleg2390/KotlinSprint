package org.example.lesson_10

fun main() {

    val user = rollsDie()
    println("Игрок выбросил $user")
    val computer = rollsDie()
    println("Машина выбросила $computer")

    when {
        user == computer -> println("Победила дружба")
        user > computer -> println("Победило человечество")
        else -> println("Победила машина")
    }
}
fun rollsDie (): Int {
    return (1..6).random()
}