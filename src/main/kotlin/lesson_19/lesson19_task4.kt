package org.example.lesson_19

enum class CartridgesAmmo (val damage: Int){

    BLUE(5),
    GREEN(10),
    RED(20),
}

fun main() {

    val tank = Tank()
    tank.loadAmmo(CartridgesAmmo.BLUE)
    tank.fire()
    tank.loadAmmo(CartridgesAmmo.GREEN)
    tank.fire()
    tank.loadAmmo(CartridgesAmmo.RED)
    tank.fire()
}

class Tank() {

    private var currentAmmo: CartridgesAmmo? = null

    fun loadAmmo(ammo: CartridgesAmmo) {
        currentAmmo = ammo
        println("танк заряжен патронами: ${currentAmmo}")
    }

    fun fire() {
        if (currentAmmo == null) {
            println("танк не заряжен")
        }else {
            println("выстрел нанес ${currentAmmo!!.damage} урона")
        }
    }
}