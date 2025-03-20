package org.example.lesson_5


fun main() {
    val firstNumberWin = 4
    val secondNumberWin = 33

    println("лотерея, нужно угадать два числа от 0 до 42")
    println("Введите первое число от 0 до 42")

    val firstNumberUser = readln().toInt()

    println("Введите второе число от 0 до 42")

    val secondNumberUser = readln().toInt()

    when {
        (firstNumberUser == firstNumberWin && secondNumberUser == secondNumberWin) ||
                (secondNumberUser == firstNumberWin && firstNumberUser == secondNumberWin) ->
            println("Поздравляем! Вы выиграли главный приз!")

        (firstNumberUser == firstNumberWin && secondNumberUser != secondNumberWin) ||
                (firstNumberUser != firstNumberWin || secondNumberUser == secondNumberWin) ->
            println("Вы выиграли утешительный приз!")

        else -> println("Неудача!")
    }

    println("числа были нужны для победы $firstNumberWin и $secondNumberWin")
}