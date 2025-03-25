package org.example.lesson_10

const val USER_LOGIN = "user"
const val USER_PASSWORD = "12345"
const val LENGTH_TOKEN = 32
const val LENGTH_TOKEN1 = 1

fun main() {

    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    val token = AuthService.authenticateUser(login, password)

    if (token != null) {
        println("Добро пожаловать")
        getCard(token)
    } else {
        println("Ошибка авторизации")
    }
}

object AuthService {
    val storageToken = mutableMapOf<String, String>()

    fun authenticateUser(login: String, password: String): String? {
        if (login == USER_LOGIN && password == USER_PASSWORD) {
            val tokenUser = autoGenerationToken()
            storageToken[tokenUser] = login
            return tokenUser
        }
        return null
    }

    fun autoGenerationToken(length: Int = LENGTH_TOKEN): String {
        val token = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
        return (LENGTH_TOKEN1..length)
            .map { token.random() }
            .joinToString("")
    }

    fun isAuthenticate(token: String): Boolean {
        return storageToken.containsKey(token)
    }
}

fun getCard(token: String) {
    val product = listOf("Ноутбук", "Смартфон", "Телевизор")
    if (AuthService.isAuthenticate(token)) {
        println(product)
    }
}