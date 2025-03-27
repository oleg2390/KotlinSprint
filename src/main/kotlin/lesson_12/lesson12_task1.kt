package org.example.lesson_12

fun main() {

    val weather1 = WeatherDay()
    weather1.daytimeTemperature = 22
    weather1.nightTemperature = 10
    weather1.precipitationDay = true

    val weather2 = WeatherDay()
    weather2.daytimeTemperature = 18
    weather2.nightTemperature = 9

    weather1.printWeather()
    println()
    weather2.printWeather()
}

class WeatherDay {
    var daytimeTemperature: Int = 25
    var nightTemperature: Int = 12
    var precipitationDay: Boolean = false

    fun printWeather() {
        println(
            """
            погода днем - $daytimeTemperature
            погода ночью - $nightTemperature
            возможны осадки - $precipitationDay
        """.trimIndent()
        )
    }
}