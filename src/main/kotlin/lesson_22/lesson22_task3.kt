package org.example.lesson_22

fun main() {

    val word3 = Word3("virus", 23, "oleg")

    val (namePerson, idPerson, authorName) = word3

    println(
        """
        namePerson - $namePerson
        isPerson - $idPerson
        author - $authorName
    """.trimIndent()
    )
}

data class Word3(

    val name: String,
    val id: Int,
    val author: String,
)