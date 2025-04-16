package org.example.lesson_20

fun main() {

    val listElements1 = listOf("element1", "element2", "element3", "element4")

    val actions: List<() -> Unit> = listElements1
        .withIndex()
        .filter {it.index % 2 == 1}
        .map { element ->
        { println("Нажат элемент - ${element.value}") }
    }
    actions.forEach {it()}
}