package org.example.lesson_3

fun main () {

    val fistName = "Татьяна"
    val patronymic = "Сергеевна"
    val surname = "Андреева"
    val newSurname = "Сидорова"
    var age20 = 20
    var age22 = 22

    val name20 = "$surname $fistName $patronymic"
    val name22 = "$newSurname $fistName $patronymic"

    println("$name20, $age20")
    println("$name22, $age22")
}