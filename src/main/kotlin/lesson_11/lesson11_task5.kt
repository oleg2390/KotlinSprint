package org.example.lesson_11

fun main() {

    val forum = Forum()

    val newUser1 = forum.createNewUser("oleg")
    val newUser2 = forum.createNewUser("Sanches")

    forum.createNewMassage(newUser1.userId, "Privet")
    forum.createNewMassage(newUser2.userId, "Poka")
    forum.createNewMassage(newUser1.userId, "idi na")
    forum.createNewMassage(newUser2.userId, "Sam idi")

    forum.printThread()
}

class Forum {

    private var id: Int = 0
    private var listUsersForum = mutableListOf<ForumUser>()
    private var massageList = mutableListOf<ForumMessage>()

    private inner class UserBuilder {

        fun build(name: String): ForumUser {
            return ForumUser(id++, name)
        }
    }

    private inner class MessageBuilder {

        fun build(authorId: Int, text: String): ForumMessage {
            return ForumMessage(authorId, text)
        }
    }

    fun createNewUser(name: String): ForumUser {
        val user = UserBuilder().build(name)
        listUsersForum.add(user)
        return user
    }

    fun createNewMassage(authorId: Int, massageUser: String) {

        if (listUsersForum.none { it.userId == authorId }) {
            println("пользователь не найден")
            return
        }
        val message = MessageBuilder().build(authorId, massageUser)
        massageList.add(message)
    }

    fun printThread() {

        for (msg in massageList) {
            val userPrint = listUsersForum.find { it.userId == msg.authorId }?.userName ?: "Неизвестно"
            println("$userPrint - ${msg.message}")
        }
    }
}

class ForumUser(
    var userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)