package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String? {

    return this.maxByOrNull { it.value }?.key
}