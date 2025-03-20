package org.example.lesson_7

fun main() {

    println("Введите дляну пароля для генерации (минимум 6)")
    val userInputNumber = readln().toInt()

    val range = (0..9).toList()
    val range2 = ('а'..'я').toList()
    val range3 = ('A'..'Z').toList()

    val result = mutableListOf(
        range.random(),
        range2.random(),
        range3.random()
    )

    val allResult = range + range2 + range3
    repeat(userInputNumber - 3) {
        result.add(allResult.random())
    }
    println("Ваш пароль: ${ result.shuffled().joinToString("") }")
}