package org.example.lesson_4

const val DEFAULT_SUNNY = true
const val DEFAULT_TENT = true
const val DEFAULT_PERCENT = 20
const val DEFAULT_SEASON = "зима"
fun main () {

    val sunny: Boolean = true
    val tentOpen: Boolean = true
    val percent: Int = 20
    val season: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        DEFAULT_SUNNY == sunny &&
        DEFAULT_TENT == tentOpen &&
        DEFAULT_PERCENT == percent &&
        DEFAULT_SEASON != season
    }")
}