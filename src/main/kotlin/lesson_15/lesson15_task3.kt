package org.example.lesson_15

fun main() {

    val usersInForum = UsersInForum(2, "oleg")
    usersInForum.readInForum()
    usersInForum.writeInForum()

    val administratorUsers = AdministratorUsers(3, "virus")
    administratorUsers.readInForum()
    administratorUsers.writeInForum()
    administratorUsers.deleteMessage(usersInForum.name)
    administratorUsers.deleteUser(usersInForum.name)
}

abstract class Users {

    abstract val id: Int
    abstract val name: String
    abstract fun readInForum()
    abstract fun writeInForum()
}

class UsersInForum (
    override val id: Int,
    override val name: String,
): Users() {

    override fun readInForum() {
        println("Пользователь $name читает форум")
    }

    override fun writeInForum() {
        println("Пользователь $name пишет на форум")
    }
}

class AdministratorUsers(
    override val id: Int,
    override val name: String,
): Users() {

    override fun readInForum() {
        println("Администратор $name читает форум")
    }

    override fun writeInForum() {
        println("Администратор $name пишет на форум")
    }

    fun deleteMessage(usersInForum: String) {
        println("Администратор удалил сообщение пользователя $usersInForum")
    }

    fun deleteUser(usersInForum: String) {
        println("Администратор удалил пользователя с именем $usersInForum")
    }
}

