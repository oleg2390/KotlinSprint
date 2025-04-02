package org.example.lesson_13

fun main() {

    val phoneDir = PhoneDirUsers()
    phoneDir.addUserInDir()

    val phoneDir1 = PhoneDirUsers()
    phoneDir1.addUserInDir()

    phoneDir1.printAllUser()
    phoneDir.printAllUser()
}

class PhoneDirUsers(
    val name: String = "",
    val phone: Long? = null,
    val company: String? = null,
) {
    private val listUserDir = mutableListOf<PhoneDirUsers>()

    fun addUserInDir() {

        println("Имя")
        val nameUser = readln()

        println("телефон")
        val phoneUser = readln().toLongOrNull()

        println("компания")
        val companyUser = readln().takeIf { it.isNotBlank() }

        val userDir = PhoneDirUsers(nameUser, phoneUser, companyUser)

        if (phoneUser != null) {
            listUserDir.add(userDir)
        } else println("пользователь не ввел номер телефона")
    }

    fun printAllUser() {
        listUserDir.forEach { println("${it.name} - ${it.phone} - ${it.company}") }
    }
}