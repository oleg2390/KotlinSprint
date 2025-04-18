package org.example.lesson_21

fun main() {

    val inputUser = "Hello"
    println("колличество гласных - ${inputUser.vowelCount()}")
}

fun String.vowelCount(): Int {
    val chars = "aeiouAEIOU"
    return this.count { it in chars }
}