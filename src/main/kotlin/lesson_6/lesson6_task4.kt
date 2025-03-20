package org.example.lesson_6

fun main() {

    val randomNumber = (1..9).random()
    var numberCounter = 5

    println("нужно угадать число в промежутке от 1 до 9")
    println("Введите число")

    while (numberCounter > 0){
        var userInputNumber = readln().toInt()

        if (userInputNumber == randomNumber){
            println("Верно! Это была великолепная игра!")
            return
        }else {
            numberCounter--
            if (numberCounter > 0){
                println("Неверно, осталось попыток $numberCounter")
            }else {
                println("Попыток больше нет, вы проиграли")
            }
        }
    }
    println("Было загадано число $randomNumber")
}