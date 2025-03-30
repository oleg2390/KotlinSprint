package org.example.lesson_14

fun main() {

    val liner = Liner()
    val cargoShip = CargoShip(4, 200)
    val iceBreaker = IceBreaker(3, true)
}

open class Liner(
    open val speed: Int = 5,
    open val loadCapacity: Int = 10,
    open val capacity: Int = 200,
    open val breakingIce: Boolean = false,
)

class CargoShip (
    override val speed: Int,
    override val loadCapacity: Int,
): Liner()

class IceBreaker(
    override val capacity: Int,
    override val breakingIce: Boolean,
): Liner()