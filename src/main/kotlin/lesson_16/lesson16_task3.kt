package org.example.lesson_16

fun main() {

    val userAutorization = UserAutorization().validationUser("1234")

    if (userAutorization) println("авторизация пройдена") else println("Error")
}

class UserAutorization(

    val login: String = "oleg",
) {

    private val password: String = "12345"

    fun validationUser(passwordUser: String) =  (password == passwordUser)
}