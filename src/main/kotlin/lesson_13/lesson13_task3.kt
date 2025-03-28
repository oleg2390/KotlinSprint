package org.example.lesson_13

fun main() {

    val listContacts = listOf(
        PhoneDir("oleg", 8954545334, null),
        PhoneDir("Ivan", 8434332234, null),
        PhoneDir("John", 8953422345, "null"),
        PhoneDir("Victor", 8953432145),
        PhoneDir("Masha", 8953443345),
    )
    listContacts.forEach { println("${it.name} - ${it.phone} - ${it.company}") }
}

class PhoneDir(
    val name: String,
    val phone: Long,
    val company: String? = null
)