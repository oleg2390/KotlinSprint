package org.example.lesson_2

const val MAGIC_NUMBER = 60
fun main () {

    val hourTrain = 9
    val minuteTrain = 39
    val timeInRoad = 457

    val allTimeStartRoadTrain = hourTrain * MAGIC_NUMBER + minuteTrain
    val allTimeRoadTrain = allTimeStartRoadTrain + timeInRoad

    val allHoursInRoad = (allTimeRoadTrain / MAGIC_NUMBER) % 24 //переход через сутки
    val remainingMinutes = allTimeRoadTrain % MAGIC_NUMBER
    val formateTime = String.format("Поезд прибудет: %d:%02d", allHoursInRoad, remainingMinutes)

    println(formateTime)
}