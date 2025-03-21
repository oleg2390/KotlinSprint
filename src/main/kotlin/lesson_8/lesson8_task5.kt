package org.example.lesson_8

fun main() {

    println("Введите колличество ингриентов:")
    val userInputCountArray = readln().toInt()
    val arrayIngredients = Array(userInputCountArray) { "" }

    for (index in 0..userInputCountArray - 1) {

        println("Введите игридиент ${index + 1}")
        val userInputIngredient = readln().toString()
        arrayIngredients[index] = userInputIngredient
    }
    println("Список ингредиентов: ${arrayIngredients.joinToString()}")
}