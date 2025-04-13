package org.example.lesson_17

fun main() {

    val ship = Ship()
    println(ship.nameShip1)
    ship.nameShip1 = "oleg"
}

class Ship(

    nameShip1: String = "KING",
    speed: Int = 23,
    portRegistration: String = "2341",
) {
    var nameShip1 = nameShip1
        get() = field
        set(value) {
            println("нельзя менять")
        }
}