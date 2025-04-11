package org.example.lesson_16

fun main() {

    val userAutorization = UserAutorization("oleg", "1234")

    val userInput = "1234"
    val valid = userAutorization.validationUser(userInput)
    println("Пароль верен: $valid")
}

class UserAutorization(

    private val login: String,
    private val password: String,
) {

    fun validationUser(passwordUser: String) = (password == passwordUser)
}