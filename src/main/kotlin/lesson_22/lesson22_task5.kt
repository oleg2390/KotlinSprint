package org.example.lesson_22

fun main() {

    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая звёздная система",
        dataTime = "2150, 3, 14, 12, 0",
        distance = 4.37
    )

    val (namePlanet, descriptionPlanet, data, distanceOfPlanet) = alphaCentauri

    println(
        """
        Название - $namePlanet
        Описание - $descriptionPlanet
        Дата - $data
        Дистанция от земли - $distanceOfPlanet
    """.trimIndent()
    )
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dataTime: String,
    val distance: Double,
)