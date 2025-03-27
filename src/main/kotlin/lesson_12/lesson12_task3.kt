package org.example.lesson_12

fun main() {
    val weatherInfo = WeatherInfo(290, 300, false)
    weatherInfo.printWeather()
}

class WeatherInfo(
    daytimeTemperature: Int,
    nightTemperature: Int,
    precipitationDay: Boolean,
) {
    private var _daytimeTemperature: Int = daytimeTemperature
    private var _nightTemperature: Int = nightTemperature
    private var _precipitationDay: Boolean = precipitationDay

    fun printWeather() {
        println(
            """
            ${String.format("погода днем: %.2f", _daytimeTemperature - 273.15)} C
            ${String.format("погода ночью: %.2f", _nightTemperature - 273.15)} C
            возможны осадки - $_precipitationDay
        """.trimIndent()
        )
    }
}