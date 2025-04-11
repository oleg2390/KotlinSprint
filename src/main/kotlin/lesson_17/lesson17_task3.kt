package org.example.lesson_17

fun main() {

    val papka = Papka("oleg", 12, true)
    println(papka.files)
    println(papka.namePap)
}

class Papka(

    private val namePapka: String,
    private val quantityOfFiles: Int,
    private val flag: Boolean = true,
) {
    val namePap: String
        get() {
            return if (flag) "скрытая папка" else namePapka
        }

    val files: Int
        get() {
            return if (flag) 0 else quantityOfFiles
        }
}