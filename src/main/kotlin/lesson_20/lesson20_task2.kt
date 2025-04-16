package org.example.lesson_20

fun main() {

    val player1 = Player1("oleg", 100, 30)

    val healing: (Player1) -> Unit = { it.currentHealth = it.maxHealth }

    healing(player1)
    player1.showInfo()
}

class Player1(

    val namePlayer: String,
    val maxHealth: Int,
    var currentHealth: Int,
) {
    fun showInfo() {
        println(
            """
            name = $namePlayer
            maxHealth = $maxHealth
            currentHealth = $currentHealth
        """.trimIndent()
        )
    }
}