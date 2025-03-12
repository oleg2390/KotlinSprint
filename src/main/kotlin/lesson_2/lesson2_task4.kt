package org.example.lesson_2

fun main () {

    val crystalOre = 7
    val ironOre = 11
    val buffMultiplier = 0.2

    val crystalBonus = (crystalOre * buffMultiplier).toInt()
    val ironBonus = (ironOre * buffMultiplier).toInt()

    println("Кристалическая руда: $crystalBonus")
    println("Железная руда: $ironBonus")
}