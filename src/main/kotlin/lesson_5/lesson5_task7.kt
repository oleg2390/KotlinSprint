package org.example.lesson_5

fun main() {

    println("Введите расстояние поездки (в километрах)")
    val distance = readln().toDouble()
    println("Введите расход топлива на 100 км (в литрах)")
    val fuelСonsumption = readln().toDouble()
    println("Введите текущую цену за литр топлива")
    val priceLiterOfFuel = readln().toDouble()

    val totalFuel = (distance * fuelСonsumption) / 100
    val totalCostOfFuel = totalFuel * priceLiterOfFuel

    val formatFuel = String.format("общее количество необходимого топлива: %.2f", totalFuel)
    val formatTotalCostOfFuel = String.format("итоговую стоимость поездки: %.2f", totalCostOfFuel)
    println(formatFuel)
    println(formatTotalCostOfFuel)
}