package org.example.lesson_14

fun main() {
    val chat = Chat()
    chat.addMessage("привет", "oleg")
    chat.addMessage("идем играть?", "Витя")
    chat.addMessage("пока", "Настя")

    chat.addThreadMessage(2, "Иван", "пока")
    chat.addThreadMessage(1, "покоритель", "пока")
    chat.addThreadMessage(2, "Игорь", "иди нах")
    chat.addThreadMessage(1, "Яфанат", "присоединяюсь")
    chat.printChat()
}

class Chat {

    private var listMassage = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(text: String, author: String) {
        listMassage.add(Message(nextId++, text, author))
    }

    fun addThreadMessage(parentMessageId: Int, author: String, message: String) {
        if (listMassage.any { it.id == parentMessageId }) {
            listMassage.add(ChildMessage(nextId++, message, author, parentMessageId))
        } else println("Ошибка")
    }

    fun printChat() {
        val groopMessage = listMassage.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }
        groopMessage.forEach { (id, messageList) ->
            messageList.forEach { message ->
                val indent = if (message is ChildMessage) "\t" else ""
                println("$indent ${message.author} - ${message.message}")
            }
        }
    }
}

open class Message(
    val id: Int,
    val message: String,
    val author: String,
)

class ChildMessage(
    id: Int,
    message: String,
    author: String,
    val parentMessageId: Int,
) : Message(id, message, author)