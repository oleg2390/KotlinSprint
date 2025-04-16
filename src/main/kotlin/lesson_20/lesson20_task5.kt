package org.example.lesson_20

fun main() {

    val invertMod: ((String) -> String) = {
        it.split(" ").joinToString(" ") { it.reversed() }
    }

    val robot = Robot()
    robot.say()
    robot.setModifier(invertMod)
    robot.say()
}

class Robot() {

    private var modifier: ((String) -> String)? = null

    val listSay = listOf(
        "Привет всем",
        "Пока всем",
        "Вам всем конец"
    )

    fun say() {

        val sayRandom = listSay.random()
        val output = modifier?.invoke(sayRandom) ?: sayRandom
        println(output)
    }

    fun setModifier(mod: (String) -> String) {
        modifier = mod
    }
}