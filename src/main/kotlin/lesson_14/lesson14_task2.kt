package org.example.lesson_14

fun main() {

    val liner1 = Liner1()
    liner1.extendsHorizontalLadder()
    liner1.printAllConfigurationLiner()
    println()

    val cargoShip1 = CargoShip1(4, 150)
    cargoShip1.activatesLoadingCrane()
    cargoShip1.printAllConfigurationCargoShip1()
    println()

    val iceBreaker1 = IceBreaker1(3, true)
    iceBreaker1.opensGateFromStern()
    iceBreaker1.printAllConfigurationIceBreaker1()
}

open class Liner1(
    open val speed: Int = 5,
    open val loadCapacity: Int = 10,
    open val capacity: Int = 200,
    open val breakingIce: Boolean = false,
) {
    fun extendsHorizontalLadder() {
        println("лайнер выдвигает горизонтальный трап со шкафута\n")
    }

    fun printAllConfigurationLiner() {
        println(
            """свойства корабля 
            |скорость - $speed
            |грузоподъемность - $loadCapacity
            |вместительность - $capacity 
            |могут колоть лёд - $breakingIce""".trimMargin()
        )
    }
}

class CargoShip1(
    override val speed: Int,
    override val loadCapacity: Int,
) : Liner1() {

    fun activatesLoadingCrane() {
        println("грузовой корабль активирует погрузочный кран\n")
    }

    fun printAllConfigurationCargoShip1() {
        println(
            """свойства корабля 
            |скорость - $speed
            |грузоподъемность - $loadCapacity
            """.trimMargin()
        )
    }
}

class IceBreaker1(
    override val capacity: Int,
    override val breakingIce: Boolean,
) : Liner1() {

    fun opensGateFromStern() {
        println("ледокол открывает ворота со стороны кормы\n")
    }

    fun printAllConfigurationIceBreaker1() {
        println(
            """свойства корабля 
            |вместительность - $capacity 
            |могут колоть лёд - $breakingIce""".trimMargin()
        )
    }
}