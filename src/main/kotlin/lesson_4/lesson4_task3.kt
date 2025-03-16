package org.example.lesson_4

const val IS_SUNNY = true
const val IS_TENT = true
const val DEFAULT_PERCENT = 20
const val DEFAULT_SEASON = "зима"
fun main () {

    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val percent: Int = 20
    val season: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        IS_SUNNY == isSunny &&
        IS_TENT == isTentOpen &&
        DEFAULT_PERCENT == percent &&
        DEFAULT_SEASON != season
    }")
}