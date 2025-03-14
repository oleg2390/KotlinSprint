package org.example.lesson_3

fun main () {

    val server = "D2-D4;0"
    val parts = server.split("-", ";")

    val from = parts[0]
    val to = parts[1]
    val number = parts[2].toInt()

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер: $number")
}