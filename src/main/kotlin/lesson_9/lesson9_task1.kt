package org.example.lesson_9

fun main() {

    val listIngredients = listOf("лук", "салат", "морковь", "соль")

    println("В рецепте есть следующие ингредиенты:")
    listIngredients.forEach{
        println(it)
    }
}