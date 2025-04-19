package org.example.lesson_22

fun main() {

    val regularBook = RegularBook("regular", "oleg")
    val regularBook1 = RegularBook("regular", "oleg")

    val dataBook = DataBook("regular", "oleg")
    val dataBook1 = DataBook("regular", "oleg")

    println(regularBook == regularBook1)
    //сравнение ссылок

    println(dataBook == dataBook1)
    //сравниваются значения свойств

}

class RegularBook(
    val nameBook: String,
    val authorBook: String,
)

data class DataBook(
    val nameBook: String,
    val authorBook: String,
)