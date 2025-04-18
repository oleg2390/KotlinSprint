package org.example.lesson_22

fun main() {

    val regularBook1 = RegularBook1("regular", "oleg")

    val dataBook1 = DataBook1("regular", "oleg")

    println(regularBook1)
    //возвращает хеш обьекта,
    // если переопределить в классе, то тоже будет возвращать красивую строку
    println(dataBook1)
    //возвращает переопределенный стринг в виде красивой строки

}

class RegularBook1(
    val nameBook: String,
    val authorBook: String,
)

data class DataBook1(
    val nameBook: String,
    val authorBook: String,
)