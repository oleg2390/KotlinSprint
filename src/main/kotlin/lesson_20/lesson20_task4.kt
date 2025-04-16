package org.example.lesson_20

fun main() {

    val listElements1 = listOf("element1", "element2", "element3", "element3")

    val actions: List<() -> Unit> = listElements1.map { element ->
        { println("Нажат элемент - $element") }
    }

    for (i in actions.indices step 2) {
        actions[i]()
    }
}