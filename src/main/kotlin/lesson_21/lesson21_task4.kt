package org.example.lesson_21

import java.io.File

fun File.writeMassage( massage: String) {

    val originalText =  this.readText()
    val updateText = (massage + originalText).lowercase()
    this.writeText(updateText)
}