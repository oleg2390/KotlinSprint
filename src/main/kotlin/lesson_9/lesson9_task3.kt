package org.example.lesson_9

fun main() {

    val listIngredients = listOf(2, 50, 15)

    println("Введите количество порций")
    val userInput = readln().toInt()

    println("""
        На $userInput порций вам понадобится:
        Яиц – ${listIngredients[0] * userInput}
        молока – ${listIngredients[1] * userInput} мл
        сливочного масла – ${listIngredients[2] * userInput} гр
    """.trimIndent())
}