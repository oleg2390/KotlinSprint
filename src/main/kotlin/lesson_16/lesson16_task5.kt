package org.example.lesson_16

private const val NUMBER_ZERO = 0

fun main() {

    val player = Player("oleg", 100, 20)
    player.hittingPlayer(20)
    player.hittingPlayer(30)
    player.hittingPlayer(40)
    player.treatmentPlayer(20)
    player.hittingPlayer(30)
    player.treatmentPlayer(20)
}

class Player(

    val namePlayer: String,
    private var healthPlayer: Int,
    var damagePlayer: Int,
) {

    private var isLive = true

    private fun deathPlayer() {

        isLive = false
        healthPlayer = NUMBER_ZERO
        damagePlayer = NUMBER_ZERO
        println("смерть игрока")
    }

    fun hittingPlayer(damage: Int) {

        if (!isLive) return

        healthPlayer -= damage
        println("Получил урона: $damage, здоровья осталось: $healthPlayer")

        if (healthPlayer <= NUMBER_ZERO) {
            deathPlayer()
        }
    }

    fun treatmentPlayer(amount: Int) {
        if (!isLive) {
            println("лечение не возможно, игрок мертв")
            return
        }
        healthPlayer += amount
        println("вылечился на $amount, здоровье $healthPlayer")
    }
}