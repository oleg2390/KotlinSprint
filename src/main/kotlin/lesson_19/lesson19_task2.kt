package org.example.lesson_19

enum class CategoryMagazine {

    clothes,
    office_supplies,
    different;

    fun info(): String {

        return when(this) {
            clothes -> "одежда"
            office_supplies -> "канцелярские товары"
            different -> "разное"
        }
    }
}

fun main() {

    val descriptionProduct = DescriptionProduct(12, "джинсы", CategoryMagazine.clothes)
    descriptionProduct.infoProduct()

    val descriptionProduct1 = DescriptionProduct(13, "ручка", CategoryMagazine.office_supplies)
    descriptionProduct1.infoProduct()
}

class DescriptionProduct(

    val idProduct: Int,
    val nameProduct: String,
    val categoryProduct: CategoryMagazine,
) {

    fun infoProduct() {
        println("$nameProduct - категория -> ${categoryProduct.info()}")
    }
}