package org.example.lesson_11

fun main() {

    val user1 = User2(
        id = 123,
        login = "oleg",
        password = "1234",
        mail = "oleg@mail.ru"
    )

    user1.getUser()
    user1.getConsoleBio()
    user1.refactorPassword()
    user1.getUser()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {

    fun getUser() {
        println(
            """
            id = $id
            login = $login
            password = $password
            mail = $mail
        """.trimIndent()
        )
    }

    fun getConsoleBio() {
        println("Введите BIO")
        val userInput = readln()
        bio = userInput
    }

    fun refactorPassword() {
        println("Для изменения введите старый пароль")
        val userInputPassword = readln()

        if (userInputPassword == password) {
            println("Введите новый пароль")
            val newPassword = readln()
            password = newPassword
            println("Пароль изменен")
        }
    }
}