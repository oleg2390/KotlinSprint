package org.example.lesson_3

fun main () {
    val number = 8
    println((1..9).joinToString("\n") { "$number * $it = ${number * it}" })
}