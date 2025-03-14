package org.example.lesson_4

const val MAX_TABLES = 13
fun main () {

    val numberOfTablesBookedToday = 13
    val numberOfTablesBookedTomorrow = 9

    println("[Доступность столиков на сегодня: ${numberOfTablesBookedToday != MAX_TABLES }]\n" +
            "[Доступность столиков на завтра: ${numberOfTablesBookedTomorrow != MAX_TABLES }]")
}