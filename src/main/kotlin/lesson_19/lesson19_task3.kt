package org.example.lesson_19

private class SpaceShip() {

    fun takeOff() {
        //TODO: реализовать логику взлета
        println("Корабль взлетает")
    }

    fun land() {
        //FIXME: нужна логика
        println("Корабль приземляется")
    }

    fun shootAsteroid() {
        throw NotImplementedError("Отстрел еще не реализован")
    }
}