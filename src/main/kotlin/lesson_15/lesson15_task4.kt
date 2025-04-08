package org.example.lesson_15

fun main() {

    val tools = Tools("Гитара", 12)
    val accessories = Accessories("струны", 20)
    tools.searchProducts()
}

abstract class Products {

    abstract val nameProducts: String
    abstract val quantityInStock: Int
}

interface SearchProducts { fun searchProducts() }

class Tools (
    override val nameProducts: String,
    override val quantityInStock: Int
): Products(), SearchProducts{

    override fun searchProducts() {
        println("Выполняется поиск комплектующих $nameProducts")
    }
}

class Accessories(
    override val nameProducts: String,
    override val quantityInStock: Int
): Products()