package org.example.lesson_5

fun main() {

    val baza_login = "Zaphod"
    val baza_password = "PanGalactic"

    println("Введите логин")
    val loginUser = readln().toString()


    if (baza_login == loginUser) {
        println("Добро пожаловать, введите пароль")

        val passwordUser = readln().toString()
        if (baza_password == passwordUser) {
            println("Приветствую, $baza_login, вам разрешено входить на борт корабля \"Heart of Gold\"")
        } else println("Пароль не верен")
    } else {
        println("Вы не зарегистрированы, хотите зарегистрироваться?")
    }
}