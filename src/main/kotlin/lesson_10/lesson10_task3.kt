package org.example.lesson_10

fun main() {

    println("Введите длинну пароля")
    val userInputLength = readln().toInt()

    println(generationPassword(userInputLength))
}

fun generationPassword(passwordLength: Int): String {

    val rangeChar = """!\"#\$%&'()*+,-./ """
    val rangeNumber = (1..9)
    val passwordGen = StringBuilder()

    for (i in 0 until passwordLength) {
        passwordGen.append(
            if (i % 2 == 0) {
                rangeNumber.random()
            } else rangeChar.random()
        )
    }
    return passwordGen.toString()
}