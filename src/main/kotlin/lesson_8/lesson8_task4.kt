package org.example.lesson_8

fun main() {

    val ingredientsInRecipe = arrayOf("морковь", "соль", "лук", "помидор")
    println("Список игредиентов: ${ingredientsInRecipe.joinToString()}")

    println("Какой ингредиент вы хотите заменить?")
    val userInputIngredient = readln().toString()

    if (userInputIngredient in ingredientsInRecipe) {
        println("какой ингредиент вы хотели бы добавить?")
        val replaceUserInputIngredient = readln().toString()

        val index = ingredientsInRecipe.indexOf(userInputIngredient)
        ingredientsInRecipe[index] = replaceUserInputIngredient

        println("Готово! Вы сохранили следующий список: ${ingredientsInRecipe.joinToString()}")
    } else println("Такого ингредиента в рецепте нет")

}