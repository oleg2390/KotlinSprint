package org.example.lesson_18

fun main() {

    val dog = Dog("собака" )
    val kat = Kat("кошка")
    val fox = Fox("лиса")

    val listAnimals: List<Animals> = listOf(dog, kat, fox)

    for (animal in listAnimals) {
        animal.eat()
    }
}

interface Animals {
    val nameAnimals: String
    fun eat()
}

class Kat(override val nameAnimals: String): Animals {
    override fun eat() {
        println("$nameAnimals -> ест рыбу")
    }
}

class Dog(override val nameAnimals: String): Animals {
    override fun eat() {
        println("$nameAnimals -> ест мясо")
    }
}

class Fox(override val nameAnimals: String): Animals {
    override fun eat() {
        println("$nameAnimals -> ест ягоды")
    }
}
