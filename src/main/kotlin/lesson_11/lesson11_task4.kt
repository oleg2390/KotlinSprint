package org.example.lesson_11

class Category(
    val id: Int,
    val title: String,
    val image: String,
    val description: String
)

class Dish(
    val id: Int,
    val image: String,
    val title: String,
    val category: Category,
    val ingredients: List<Ingredients>,
    val steps: List<String>,
    val coocingTime: Int,
    val inFavorites: Boolean = false
)

class Ingredients(
    val id: Int,
    val name: String,
    val weight: Int,
    val count: Int

)