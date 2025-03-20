package org.example.lesson_6

fun main() {

    var countАttempt = 3

    while (countАttempt > 0) {
        val randomNumberFirst = (1.. 9).random()
        val randomNumberSecond = (1.. 9).random()
        val result = randomNumberSecond + randomNumberFirst

        println("Напишите сумму чисел $randomNumberFirst + $randomNumberSecond если вы не бот")
        val userСaptcha = readln().toInt()

        if (result == userСaptcha) {
            println("Добро пожаловать!")
            return
        } else {
            countАttempt--

            if (countАttempt > 0) {
                println("Не верно, осталось попыток: $countАttempt")
            } else println("Доступ запрещен")
        }
    }
}