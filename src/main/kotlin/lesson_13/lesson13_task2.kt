package org.example.lesson_13

fun main() {
    val phoneDir = PhoneDir("Ростислав", 89123456789, "Reddit").printInfo()
}

class PhoneDir(
    val name: String,
    val phone: Long,
    val company: String? = null
){
    fun printInfo() {
        println("Имя: $name\nНомер: $phone\nЛщмпания: $company")
    }
}