package org.example.lesson_21

class Player5(

    val namePlayer5: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player5.isHealthy(): Boolean {
    return currentHealth == maxHealth
}