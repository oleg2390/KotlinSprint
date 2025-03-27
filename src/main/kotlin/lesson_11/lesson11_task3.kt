package org.example.lesson_11

enum class Status {
    разговаривает,
    пользователь_заглушен,
    микрофон_выключен,
}

fun main() {

    val room = Room(
        cover = "cover23.jpg",
        title = "Политика"
    )

    val user1 = Particip("avatar1.jpg", "oleg", Status.разговаривает)
    val user2 = Particip("avatar2.jpg", "Valera", Status.микрофон_выключен)
    val user3 = Particip("avatar3.jpg", "Tor", Status.пользователь_заглушен)

    room.addParticipant1(user1)
    room.addParticipant1(user2)
    room.addParticipant1(user3)
    println()

    println(
        """
        Комната ${room.title}
        Обложка ${room.cover}
        Участники: 
        ${user1.nik} - ${user1.status}
        ${user2.nik} - ${user2.status}
        ${user3.nik} - ${user3.status}
    """.trimIndent()
    )
    println()
    room.updateStatus(user1.nik, Status.пользователь_заглушен)
    println()

    println(
        """
        Комната ${room.title}
        Обложка ${room.cover}
        Участники: 
        ${user1.nik} - ${user1.status}
        ${user2.nik} - ${user2.status}
        ${user3.nik} - ${user3.status}
    """.trimIndent()
    )
}

class Room(
    var cover: String,
    var title: String,
) {

    var listParticipant1 = mutableListOf<Particip>()

    fun addParticipant1(particip: Particip) {
        listParticipant1.add(particip)
        println("Участник с именем ${particip.nik} добавлен в комнату")
    }

    fun updateStatus(nik: String, newStatus: Status) {
        for (participant in listParticipant1) {
            if (participant.nik == nik) {
                participant.status = newStatus
                println("Статус для ${participant.nik} обновлен на ${participant.status}")
            }
        }
    }

}

class Particip(
    val avatar: String,
    val nik: String,
    var status: Status
)