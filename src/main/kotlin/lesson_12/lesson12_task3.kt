package org.example.lesson_12

const val CELS = 273.15
fun main() {
    val weatherInfo = WeatherInfo(290, 300, false)
    weatherInfo.printWeather()
}

class WeatherInfo(
    daytimeTemperature: Int,
    nightTemperature: Int,
    precipitationDay: Boolean,
) {
    private var _daytimeTemperature = daytimeTemperature - CELS
    private var _nightTemperature = nightTemperature - CELS
    private var _precipitationDay: Boolean = precipitationDay



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