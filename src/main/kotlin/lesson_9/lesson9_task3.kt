package org.example.lesson_9

fun main() {

    val listIngredients = listOf(2, 50, 15)

    println("Введите количество порций")
    val numOfPortions = readln().toInt()

    val neededComponent = listIngredients.map { it * numOfPortions }

    println("""
        На $numOfPortions порций вам понадобится:
        Яиц – ${neededComponent[0]}
        молока – ${neededComponent[1]} мл
        сливочного масла – ${neededComponent[2]} гр
    """.trimIndent())
}