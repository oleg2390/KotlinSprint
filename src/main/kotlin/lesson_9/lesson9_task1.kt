package org.example.lesson_9

fun main() {

    val listIngredients = listOf("лук", "салат", "морковь", "соль")

    for (index in listIngredients.indices){
        println("В рецепте есть следующие ингредиенты: ${listIngredients[index]}")
    }
}