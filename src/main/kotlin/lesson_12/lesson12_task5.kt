package org.example.lesson_12

const val DAY_TEMP_RANGE1 = 200
const val DAY_TEMP_RANGE2 = 300
const val NIGHT_TEMP_RANGE1 = 200
const val NIGHT_TEMP_RANGE2 = 300
const val DEF_NUMBER = 0
const val RANGE_IF1 = 0
const val RANGE_IF2 = 30

fun main() {

    var list = mutableListOf<WeatherInform>()

    for (i in RANGE_IF1..RANGE_IF2) {
        val weatherInf = WeatherInform(
            (DAY_TEMP_RANGE1..DAY_TEMP_RANGE2).random(),
            (NIGHT_TEMP_RANGE1..NIGHT_TEMP_RANGE2).random()
        )
        list.add(weatherInf)
    }

    val averageDayTemperature = list.map { it._daytimeTemperature }.average()
    val averageNightTemperature = list.map { it._nightTemperature }.average()

    var allDayPrecipitation = DEF_NUMBER
    val costPrecipitationDay = list.map {
        if (it._precipitationDay) {
            allDayPrecipitation++
        }
    }

    println("Средня дневная температура - $averageDayTemperature")
    println("Средня ночная температура - $averageNightTemperature")
    println("Колличество дней с осадками - $allDayPrecipitation")
}

class WeatherInform(
    daytimeTemperature: Int,
    nightTemperature: Int,
    precipitationDay: Boolean = listOf(true, false).random()
) {
    var _daytimeTemperature: Int = daytimeTemperature
    var _nightTemperature: Int = nightTemperature
    var _precipitationDay: Boolean = precipitationDay
}