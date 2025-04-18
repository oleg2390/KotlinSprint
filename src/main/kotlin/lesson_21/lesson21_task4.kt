package org.example.lesson_21

import java.io.File

fun File.writeMassage( massage: String) {

    this.appendText("\n${massage.lowercase()}")
}