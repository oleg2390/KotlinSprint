package org.example.lesson_18

private const val NUMBER_1 = 1

fun main() {

    val d4 = Cubik4(4)
    val d6 = Cubik6(6)
    val d8 = Cubik8(8)

    val listCubik = listOf<Cubik>(d4, d6, d8)

    for (cub in listCubik) {
        cub.brosok()
    }
}

open class Cubik(
    open val grani: Int
) {

    open fun brosok() {
        val result = (NUMBER_1..grani).random()
        println("Выбросил число $result ")
    }
}

class Cubik4(grani: Int) : Cubik(grani)

class Cubik6(grani: Int) : Cubik(grani)

class Cubik8(grani: Int) : Cubik(grani)