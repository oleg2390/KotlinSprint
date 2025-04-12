package org.example.lesson_18

import kotlin.math.pow

private const val NUMBER_6 = 6
private const val NUMBER_2 = 2

abstract class Box {

    abstract fun getArea(): Double
}

class RectangleBox(

    val length: Double,
    val width: Double,
    val height: Double,
) : Box() {

    override fun getArea(): Double {
        return NUMBER_2 * (length * width + width * height + height * length)
    }
}

class CubeBox(

    val edge: Double,
) : Box() {

    override fun getArea(): Double {
        return NUMBER_6 * edge.pow(2)
    }
}
