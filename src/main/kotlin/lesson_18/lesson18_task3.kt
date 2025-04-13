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

abstract class Animals(val nameAnimals: String) {

   abstract fun eat()
}

class Kat(nameAnimals: String): Animals(nameAnimals) {
    override fun eat() {
        println("$nameAnimals -> ест рыбу")
    }
}

class Dog(nameAnimals: String): Animals(nameAnimals) {
    override fun eat() {
        println("$nameAnimals -> ест мясо")
    }
}

class Fox(nameAnimals: String): Animals(nameAnimals) {
    override fun eat() {
        println("$nameAnimals -> ест ягоды")
    }
}
