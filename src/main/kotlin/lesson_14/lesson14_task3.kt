package org.example.lesson_14

private const val NUMBER_P = 3.14
private const val DEFAULT_NUMBER_2 = 2

fun main() {

   val listFigure = listOf(
       Circle("белый", 3.0),
       Circle("черный", 4.0),
       Rectangle("белый", 4.0, 2.0),
       Rectangle("черный", 3.0, 2.0)
   )
    val perimeterSummaBlack = listFigure.filter { it.color == "черный" }.sumOf { it.calculatingPerimeter() }
    val sumArea = listFigure.filter { it.color == "белый"}.sumOf { it.calculatingArea() }

    println(String.format("Сумма периметров всех черных фигур: %.2f",perimeterSummaBlack))
    println(String.format("Сумма площадей всех белых фигур: %.2f",sumArea))
}

abstract class Figure(val color: String) {

    abstract fun calculatingArea(): Double
    abstract fun calculatingPerimeter(): Double
}

class Circle(
    color: String,
    private val radius: Double,
) : Figure(color) {

    override fun calculatingArea(): Double = NUMBER_P * (radius * radius)
    override fun calculatingPerimeter(): Double = DEFAULT_NUMBER_2 * NUMBER_P * radius
}

class Rectangle(
    color: String,
    private val width: Double,
    private val height: Double,
): Figure(color) {

    override fun calculatingArea(): Double = width * height
    override fun calculatingPerimeter(): Double = (width + height) * DEFAULT_NUMBER_2
}
