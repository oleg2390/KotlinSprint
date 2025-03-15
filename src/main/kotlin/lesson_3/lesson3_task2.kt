package org.example.lesson_3

fun main () {

    val fistName = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Андреева"
    var age20 = 20
    var age22 = 22

    val name20 = "$surname $fistName $patronymic"
    surname = "Сидорова"
    val name22 = "$surname $fistName $patronymic"

    println("$name20, $age20")
    println("$name22, $age22")
}