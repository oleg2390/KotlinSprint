package org.example.lesson_20

fun main() {

    val welcomeUser: (String) -> String  = { userName ->
        "С наступающим Новым Годом, $userName!"
    }

    println(welcomeUser("oleg"))
}