package org.example.lesson_15

fun main() {

    val temperature = Temperature(23).getResult()
    val precipitationAmount = PrecipitationAmount(12).getResult()
}

abstract class WeatherStationStats {
    abstract fun getResult()
}

class Temperature(
    val temperature: Int,
) : WeatherStationStats() {
    override fun getResult() {
        println("получили температуру - $temperature")
    }
}

class PrecipitationAmount(
    val precipitationAmount: Int,
) : WeatherStationStats() {
    override fun getResult() {
        println("Количество осадков - $precipitationAmount %")
    }
}