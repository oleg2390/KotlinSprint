package org.example.lesson_9

fun main() {

    println("Введите пять названий ингредиентов")
    val listIngredients = mutableSetOf<String>()

    for (i in 1..5) {
        var userIngredient: String
        do {
            println("Введите $i ингредиент")
            userIngredient = readln()
            if (userIngredient in listIngredients) {
                println("Такой ингредиент уже есть")
            }
        } while (userIngredient in listIngredients)
        listIngredients.add(userIngredient)
    }

    val formateList = listIngredients.mapIndexed { index, ingredient ->
        if (index == 0) {
            ingredient.replaceFirstChar { it.uppercase() }
        } else ingredient
    }
    println(formateList.sorted().joinToString())
}