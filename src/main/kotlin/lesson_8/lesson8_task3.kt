package org.example.lesson_8

fun main() {

    val ingredientsInRecipe = arrayOf("морковь", "соль", "лук", "помидор")
    var found = false

    println("Какой ингредиент вы хотите найти?")
    val userInputIngredient = readln().toString()

    if (userInputIngredient in ingredientsInRecipe){
        println("Ингредиент $userInputIngredient в рецепте есть")
    }else println("Такого ингредиента в рецепте нет")
}