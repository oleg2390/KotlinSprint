package org.example.lesson_14

fun main() {

    val earth = Planet("Земля", true, true)
    val moon = Satellite("Луна", true, true)
    val phobos = Satellite("Фобос", true, true)
    earth.satellite(moon)
    earth.satellite(phobos)
    earth.printInfo()
}

abstract class CelestialBodies(
    val nameCelestial: String,
    val hasAtmosphere: Boolean,
    val suitableDisembarkation: Boolean,
)

class Planet(
    nameCelestial: String,
    hasAtmosphere: Boolean,
    suitableDisembarkation: Boolean,
    val listSatellite: MutableList<Satellite> = mutableListOf(),
) : CelestialBodies(nameCelestial, hasAtmosphere, suitableDisembarkation) {

    fun satellite(satellite: Satellite) {
        listSatellite.add(satellite)
    }

    fun printInfo() {
        println("Планета - $nameCelestial")

        if (listSatellite.isNotEmpty()) {
            println("Спутники")
            listSatellite.forEach { println(it.nameCelestial) }
        } else println("нет спутников")
    }
}

class Satellite(
    nameCelestial: String,
    hasAtmosphere: Boolean,
    suitableDisembarkation: Boolean
) : CelestialBodies(nameCelestial, hasAtmosphere, suitableDisembarkation)
