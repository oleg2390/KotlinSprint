package org.example.lesson_18

fun main() {

    val crm = Crm(10, "computer")
    crm.printCrm()

    val crm2 = Crm(20, listOf("computer", "video carta", "box"))
    crm2.printCrm()
}

class Crm(
    val numberOrderPac: Int,
    private val product: Any,
){
    fun printCrm() {
        when(product) {
            is String -> println("Заказан товар: $product")
            is List<*> -> {
                val productList = product.filterIsInstance<String>()
                println("Заказаны следующие товары: ${productList.joinToString()}")
            }else -> println("не верный формат")
        }
    }
}