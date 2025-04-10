package org.example.lesson_16

fun main() {

    val userAutorization = UserAutorization("oleg", "1234").validationUser("1234")

    if (userAutorization) println("авторизация пройдена") else println("Error")
}

class UserAutorization(

    private val login: String,
    private val password: String,
) {

    fun validationUser(passwordUser: String) = (password == passwordUser)
}