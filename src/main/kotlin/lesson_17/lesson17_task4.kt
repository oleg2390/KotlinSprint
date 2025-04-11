package org.example.lesson_17

fun main() {

    val package1 = Package1("1234556", "посылка принята")
    println("номер посылки: ${package1.numberPackage}")
    println("Статус посылки: ${package1.statusPackage}")
    println("Перемещений : ${package1.countPackage}")

    package1.statusPackage = "посылка прибыла на пункт 2"
    println("номер посылки: ${package1.numberPackage}")
    println("Статус посылки: ${package1.statusPackage}")
    println("Перемещений : ${package1.countPackage}")

    package1.statusPackage = "посылка прибыла на пункт 3"
    println("номер посылки: ${package1.numberPackage}")
    println("Статус посылки: ${package1.statusPackage}")
    println("Перемещений : ${package1.countPackage}")

}

class Package1(

    val numberPackage: String,
    statusPackage: String,
) {
    var countPackage: Int = 0
        private set

    var statusPackage: String = statusPackage
        set(value) {
            field = value  // Обновляем местоположение
            countPackage++    // Увеличиваем счетчик перемещений
        }
}