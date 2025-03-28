package org.example.lesson_13

fun main() {

    val listContacts = listOf(
        PhoneDir1("oleg", 8954545334, null),
        PhoneDir1("Ivan", 8434332234, null),
        PhoneDir1("John", 8953422345, "null"),
        PhoneDir1("Victor", 8953432145),
        PhoneDir1("Masha", 8953443345),
    )
    listContacts.forEach { println("${it.name} - ${it.phone} - ${it.company}") }
}

class PhoneDir1(
    val name: String,
    val phone: Long,
    val company: String? = null
)