package org.example.lesson_13

fun main() {

    var userInputPhone: Long? = null

    while (userInputPhone == null) {

        println("введите телефон")
        userInputPhone = try {
            readln().toLong()

        } catch (e: NumberFormatException) {
            println("Ошибка: введите корректное число!")
            null
        }
    }
    val phoneDirUsers1 = PhoneDirUsers1("oleg", userInputPhone, null).printPhoneUsers()
}

class PhoneDirUsers1(
    val name: String = "",
    val phone: Long? = null,
    val company: String? = null,
) {
    fun printPhoneUsers() {
        println("$name - $phone - $company")
    }
}