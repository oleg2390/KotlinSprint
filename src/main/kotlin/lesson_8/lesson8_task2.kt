package org.example.lesson_8

fun main() {
    val ingredientsInRecipe = arrayOf("морковь", "соль", "лук", "помидор")
    var found = false

    println("Какой ингредиент вы хотите найти?")
    val userInputIngredient = readln().toString()

    for (ingredient in ingredientsInRecipe) {
        if (ingredient == userInputIngredient) {
            found = true
        }
    }
    if (found) {
        println("Ингредиент $userInputIngredient в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}