package org.example.lesson_18

private const val NUMBER_1 = 1

fun main() {

    val d4 = Cubik4()
    val d6 = Cubik6()
    val d8 = Cubik8()

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

class Cubik4(override val grani: Int = 4) : Cubik(grani)

class Cubik6(override val grani: Int = 6) : Cubik(grani)

class Cubik8(override val grani: Int = 8) : Cubik(grani)