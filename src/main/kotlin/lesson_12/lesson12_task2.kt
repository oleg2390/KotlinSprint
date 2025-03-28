package org.example.lesson_12

fun main() {

    val weatherInformation = WeatherInformation(
        daytimeTemperature = 12,
        nightTemperature = 2,
        precipitationDay = true
    ).printWeather()
}

class WeatherInformation(
    var daytimeTemperature: Int,
    var nightTemperature: Int,
    var precipitationDay: Boolean,
) {

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