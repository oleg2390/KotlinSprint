package org.example.lesson_1

fun main () {
    println("Тестовое решение задач к уроку 1 задаче 5")
    println()

    val second: Long = 6480//колличество секунда Гагарина в космосе

    val resultOfMinute = second / 60

    val resulOfHour = resultOfMinute / 60
    val resulOfHourBalance = resultOfMinute % 60
    val resultOfMinuteBalance = second % 60

    println("Гагарин провел в космосе 0$resulOfHour:$resulOfHourBalance:0$resultOfMinuteBalance")




}