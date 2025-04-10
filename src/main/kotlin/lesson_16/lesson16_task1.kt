package org.example.lesson_16

class Cube(
    private var randomNumberCube: Int = (1..6).random()
){
    fun getRandomNumberCube() { println("${randomNumberCube}")}
}