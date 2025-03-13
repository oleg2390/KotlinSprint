package org.example.lesson_4

fun main () {

    val numberDay = 5
    val bodyDay = numberDay % 2 != 0

    println("""
        Упражнения для рук:    $bodyDay
        Упражнения для ног:    ${!bodyDay}
        Упражнения для спины:  ${!bodyDay}
        Упражнения для пресса: $bodyDay
    """.trimIndent())
}