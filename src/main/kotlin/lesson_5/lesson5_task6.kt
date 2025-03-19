package org.example.lesson_5

import kotlin.math.pow

fun main() {

    println("Введите свой вес в кг:")
    val userWeight = readln().toDouble()
    println("Введите свой рост в сантиметрах:")
    val userGrowth = readln().toDouble()

    val imt = userWeight / (userGrowth / 100).pow(2.0)
    when {
        imt < 18.5 -> println("Недостаточная масса тела")
        imt < 25.0 -> println("Нормальная масса тела")
        imt < 30.0 -> println("Избыточная масса тела")
        imt >= 30.0 -> println("Ожирение")
    }
}