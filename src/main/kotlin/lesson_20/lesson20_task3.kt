package org.example.lesson_20

fun main() {

    val player2 = Player2(false)

    val checkPlayerKey: (Player2) -> String = {
        if (it.isKey) {
            "Игрок открыл дверь"
        } else "Дверь заперта"
    }

    println(checkPlayerKey(player2))
}

class Player2(
    val isKey: Boolean,
)