package org.example.lesson_10

fun main() {

    println("Введите логин")
    val userName = readln()

    println("Введите пароль")
    val userPassword = readln()

    if (isValidLength(userName) && isValidLength(userPassword)) {
        println("Добро пожаловать")
    } else
        println("Логин или пароль недостаточно длинные")
}

const val CHAR_LENGTH = 4

fun isValidLength(inputChar: String): Boolean = inputChar.length >= CHAR_LENGTH