package org.example.lesson_15

private const val MAX_PASSENGER1 = 3
private const val MAX_PASSENGER2 = 1
private const val MAX_CARGO = 2000

fun main() {

    val automobil = Automobil(4)
    val automobil1 = Automobil(2)

    val cargoAuto = CargoAuto(2000, 2)

    automobil.passengerLoading()
    automobil.moving()
    automobil.passengerUnloading()
    println()

    automobil1.passengerLoading()
    automobil1.moving()
    automobil1.passengerUnloading()
    println()

    cargoAuto.cargoLoading()
    cargoAuto.passengerLoading()
    cargoAuto.moving()
    cargoAuto.passengerUnloading()
    cargoAuto.cargoUnloading()


}

class Automobil(
    override var passenger: Int,
) : Passenger, Movement {

    override fun passengerLoading() {
        if (passenger <= MAX_PASSENGER1) {
            println("загрузил пассажиров: $passenger")
        } else {
            passenger = MAX_PASSENGER1
            println("много пассажиров для авто, загрузил пассажиров: $passenger")
        }
    }

    override fun passengerUnloading() {
        println("выгрузил пассажиров: $passenger")
    }

    override fun moving() {
        println("движется")
    }
}

class CargoAuto(
    override var cargo: Int,
    override var passenger: Int,
) : Movement, Cargo, Passenger {

    override fun moving() {
        println("движется")
    }

    override fun cargoLoading() {
        if (cargo <= MAX_CARGO) {
            println("загрузил колличество груза: $cargo")
        } else {
            cargo = MAX_CARGO
            println("Прегруз. Загрузил $cargo")
        }
    }

    override fun cargoUnloading() {
        println("Выгрузил колличество груза: $cargo")
    }

    override fun passengerLoading() {
        if (passenger <= MAX_PASSENGER2) {
            println("загрузил пассажиров: $passenger")
        } else {
            passenger = MAX_PASSENGER2
            println("много пассажиров для грузовика, загрузил пассажиров: $passenger")
        }
    }

    override fun passengerUnloading() {
        println("выгрузил пассажиров: $passenger")
    }
}

interface Movement {
    fun moving()
}

interface Passenger {

    val passenger: Int
    fun passengerLoading()
    fun passengerUnloading()
}

interface Cargo {

    val cargo: Int
    fun cargoLoading()
    fun cargoUnloading()
}