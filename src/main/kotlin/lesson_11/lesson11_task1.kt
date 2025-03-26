package org.example.lesson_11

fun main() {

    val user1 = User(
        id = 12323,
        login = "oleg",
        password = "12345",
        mail = "login@mail.ru"
    )

    val user2 = User(
        id = 234342,
        login = "gnom",
        password = "123456789",
        mail = "gnom@mail.ru"
    )

    println(
        """
        id = ${user1.id}
        login = ${user1.login}
        password = ${user1.password}
        mail = ${user1.mail}
    """.trimIndent()
    )
    println()

    println(
        """
        id = ${user2.id}
        login = ${user2.login}
        password = ${user2.password}
        mail = ${user2.mail}
    """.trimIndent()
    )

}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)