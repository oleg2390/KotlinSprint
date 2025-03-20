package org.example.lesson_7

fun main() {

    while (true){
        val range = 1000..9999
        val randomCode = range.random()

        println("Введите код и СМС: $randomCode")
        val userInputCode = readln().toInt()

        if (userInputCode == randomCode){
            println("Прветствую вас!")
            break
        }else println("Не верно")
    }
}