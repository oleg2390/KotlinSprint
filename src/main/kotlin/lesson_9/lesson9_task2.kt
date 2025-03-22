package org.example.lesson_9

fun main() {

    val listIngredients = mutableListOf("лук", "соль", "перец")
    println("В рецепте есть базовые ингредиенты: ${listIngredients.joinToString()}")
    println("Желаете добавить еще?")
    val userResponse = readln().toString()

    if (userResponse.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val userAddIngredient = readln().toString()
        listIngredients.add(userAddIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: ${listIngredients.joinToString()}")
    } else return
}