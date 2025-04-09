package org.example.lesson_16

private const val NUMBER_PI = 3.14

fun main() {

    val circleResult = CircleResult(4)
    circleResult.getLengthCircle()
    circleResult.getAreaCircle()
}

class CircleResult(

    private val radius: Int,
) {

    fun getLengthCircle() {
        val result = 2 * NUMBER_PI * radius
        println("длина окружности - $result")
    }

    fun getAreaCircle() {
        val result = NUMBER_PI * radius * radius
        println("площадь круга - $result")
    }
}