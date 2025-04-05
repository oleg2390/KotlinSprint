package org.example.lesson_15

fun main() {

    val fish = Fish().swimming()
    val chaika = Chaika().flying()
    val duck = Duck()
    duck.flying()
    duck.swimming()
}

interface FlyingCreatures {
    fun flying()
}

interface SwimmingCreatures {
    fun swimming()
}

class Chaika(
    private val name: String = "чайка",
) : FlyingCreatures {
    override fun flying() {
        println("$name летает")
    }
}

class Fish(
    private val name: String = "карась",
) : SwimmingCreatures {
    override fun swimming() {
        println("$name плавает")
    }
}

class Duck(
    private val name: String = "утка",
) : SwimmingCreatures, FlyingCreatures {
    override fun swimming() {
        println("$name плавает")
    }

    override fun flying() {
        println("$name летает")
    }
}