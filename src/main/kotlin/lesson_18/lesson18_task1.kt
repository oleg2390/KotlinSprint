package org.example.lesson_18

fun main() {

    val crm = Crm(10)
    crm.printCrm("computer")

    val crm2 = Crm(20)
    crm2.printCrm(listOf("computer", "video carta", "box"))
}

class Crm(
    val numberOrderPac: Int,
){

    fun printCrm(product: String) {
        println("Заказан товар: $product")
    }

    fun printCrm(product: List<String>) {
        println("Заказаны следующие товары: ${product.joinToString()}")
    }
}