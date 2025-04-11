package org.example.lesson_17

fun main() {

    val user2 = User2("oleg", "123456")
    user2.nameUser2 = "name"
    println(user2.passwordUser2)
    user2.passwordUser2 = "232323"
}

class User2(
    nameUser2: String,
    passwordUser2: String,
){

    var nameUser2: String = nameUser2
        set(value) {
            field = value
            println("успешной смене логина")
        }

    var passwordUser2: String = passwordUser2
        get() {return "*".repeat(field.length)}
        set(value) = println("Вы не можете изменить пароль")
}