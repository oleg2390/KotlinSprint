package org.example.lesson_18

class Screen() {

    fun draw(x: Int, y: Int): String {
        return "Нарисована точка в ($x, $y)"
    }

    fun draw(x: Float, y: Float): String {
        return "Нарисована точка в ($x, $y)"
    }

    fun drawCircle(x: Int, y: Int): String {
        return "Нарисован круг в ($x, $y)"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Нарисован круг в ($x, $y)"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Нарисован квадрат в ($x, $y)"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "Нарисован квадрат в ($x, $y)"
    }
}