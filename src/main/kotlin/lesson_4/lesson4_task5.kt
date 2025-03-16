package org.example.lesson_4

const val MIN_NUMBER_CREW = 55
const val MAX_NUMBER_CREW = 70
const val MIN_PROVISION = 50
fun main () {

    println("наличие повреждений корпуса")
    val hasDamage = readln().toBoolean()
    println("текущий состав экипажа")
    val crew = readln().toInt()
    println("количество ящиков с провизией на борту")
    val provision = readln().toInt()
    println("благоприятность метеоусловий")
    val hasWeather = readln().toBoolean()

    print("Научно-исследовательский корабль может приступить к долгосрочному плаванию: ")
    println(
        (!hasDamage && crew in MIN_NUMBER_CREW..MAX_NUMBER_CREW && provision > MIN_PROVISION) ||
            (hasDamage && crew == MAX_NUMBER_CREW && provision >= MIN_PROVISION && hasWeather)

    )

}