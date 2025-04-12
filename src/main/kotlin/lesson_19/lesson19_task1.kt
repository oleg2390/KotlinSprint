package org.example.lesson_19

enum class Fish(val description: String) {

    guppy("гуппи"),
    angelfish("скалярия"),
    goldfish("золотая рыбка"),
}

fun main() {

    println("можете добавить в свой аквариум:")

    Fish.values().forEach { fish ->
        println("${fish.name} - ${fish.description}")
    }
}
