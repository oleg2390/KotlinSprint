package org.example.lesson_6

fun main() {

    var userName = ""
    var userPassword = ""

    println("Registration")

    println("Create you name")
    userName = readln()

    println("Create you password")
    userPassword = readln()

    println("You are registered")

    while (true) {
        println("Authorization")

        println("Enter you name")
        val inputUserName = readln().toString()

        println("Enter you password")
        val inoutUserPassword = readln().toString()

        if (userName == inputUserName && userPassword == inoutUserPassword) {
            println("Authorization was successful!")
            break
        } else println("Invalid username or password. Try again.")
    }
}