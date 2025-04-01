package org.example.lesson_12



const val CELS1 = 273.15

fun main() {


    val weatherInf = WeatherInf(320, 300, false)
}

class WeatherInf(
    daytimeTemperature: Int,
    nightTemperature: Int,
    precipitationDay: Boolean,
) {

    private var _daytimeTemperature = daytimeTemperature - CELS1
    private var _nightTemperature = nightTemperature - CELS1
    private var _precipitationDay: Boolean = precipitationDay

    init {
        printWeather()
    }

    fun printWeather() {
        println(
            """
            ${String.format("погода днем: %.2f", _daytimeTemperature )} C
            ${String.format("погода ночью: %.2f", _nightTemperature )} C
            возможны осадки - $_precipitationDay
        """.trimIndent()
        )

    }
}