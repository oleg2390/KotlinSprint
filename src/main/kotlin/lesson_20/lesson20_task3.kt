package org.example.lesson_20

fun main() {

    val player2 = Player2(true)

    val checkPlayerKey: (Player2) -> String = {
        if (false) {
            "Игрок открыл дверь"
        } else "Дверь заперта"
    }

    println(checkPlayerKey(player2))
}

class Player2(
    val isKey: Boolean,
)