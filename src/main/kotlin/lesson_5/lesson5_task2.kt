package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJOR = 18
fun main () {
    println("Введите свой год рождения (пример 2000) ")

    val ageUser = readln().toInt()
    val resultAccessIn = LocalDate.now().year - ageUser

    if (resultAccessIn >= AGE_OF_MAJOR){
        println("Показать экран со скрытым контентом")
    }else{
        println("Доступ запрещен")
    }
}