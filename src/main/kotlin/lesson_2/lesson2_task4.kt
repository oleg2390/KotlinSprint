package org.example.lesson_2

const val NUMBER_100 = 100
fun main () {

    val crystalOre = 7
    val ironOre = 11
    val buffMultiplier = 20

    val crystalBonus = (crystalOre * buffMultiplier / NUMBER_100 )
    val ironBonus = (ironOre * buffMultiplier / NUMBER_100 )

    println("Кристалическая руда: $crystalBonus")
    println("Железная руда: $ironBonus")
}