package org.example.lesson_22

fun main() {

    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая звёздная система",
        dataTime = "2150, 3, 14, 12, 0",
        distance = 4.37
    )

    println(
        """
        Название - ${alphaCentauri.component1()}
        Описание - ${alphaCentauri.component2()}
        Дата - ${alphaCentauri.component3()}
        Дистанция от земли - ${alphaCentauri.component4()}
    """.trimIndent()
    )
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dataTime: String,
    val distance: Double,
)