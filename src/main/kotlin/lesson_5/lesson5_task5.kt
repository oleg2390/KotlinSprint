package org.example.lesson_5

const val RANGE_NUMBER_1 = 0
const val RANGE_NUMBER_2 = 42
fun main() {

    val numberD = List(3) {(1..42).random()}
    val userNumbers = mutableSetOf<Int>()

    println("Введите 3 числа от $RANGE_NUMBER_1 до $RANGE_NUMBER_2")

    while (userNumbers.size < 3) {
        println("Введите число ${userNumbers.size + 1}/3")
        val input = readln().toInt()

        if (input in RANGE_NUMBER_1..RANGE_NUMBER_2) {
            userNumbers.add(input)
        } else println("Не корректный ввод, введите еще раз число от $RANGE_NUMBER_1..$RANGE_NUMBER_2")
    }

    val matches = userNumbers.intersect(numberD).size

    when (matches) {
        3 -> println("Вы угадали все числа и выиграл джекпот")
        2 -> println("Вы угадали два числа и получает крупный приз")
        1 -> println("Вы угадали одно число, вам выплачивается утешительный приз")
        else -> println("Вы не угадали ни одного числа")
    }
    println("выигрышные числа ${numberD}")
}