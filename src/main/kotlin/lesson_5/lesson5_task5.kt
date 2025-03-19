package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val numberForWin = List(3) { Random.nextInt(0, 42) }.toSet()
    val userNumbers = mutableSetOf<Int>()

    println("Введите 3 числа от 0 до 42")

    while (userNumbers.size < 3) {
        println("Введите число ${userNumbers.size + 1}/3")
        val input = readln().toInt()

        if (input in 0..42) {
            userNumbers.add(input)
        } else println("Не корректный ввод, введите еще раз число от 0..42")
    }

    val matches = userNumbers.intersect(numberForWin).size

    when (matches) {
        3 -> println("Вы угадали все числа и выиграл джекпот")
        2 -> println("Вы угадали два числа и получает крупный приз")
        1 -> println("Вы угадали одно число, вам выплачивается утешительный приз")
        else -> println("Вы не угадали ни одного числа")
    }
    println("выигрышные числа ${numberForWin}")
}