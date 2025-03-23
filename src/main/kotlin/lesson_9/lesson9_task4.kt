package org.example.lesson_9

fun  main() {

    println("Введите 5 ингредиентов, перечисленных через запятую с пробелом")
    val userInput = readln()

    val listIngredients = userInput.split(", ").toList()
    println("Ваш список игредиентов: ${listIngredients.sorted().joinToString()}")
}