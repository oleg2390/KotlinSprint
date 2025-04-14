package org.example.lesson_19

enum class Gender {
    мужской,
    женский,
}


fun main() {

    val inputPerson = InputPerson()
    inputPerson.inputUser()
}

class InputPerson() {

    private val listPersons = mutableListOf<Person>()

    fun inputUser() {

        println("Введите данные 5 человек в формате: имя пол(${Gender.мужской}, ${Gender.женский})")
        repeat(5) {
            val (inputName, inputGender) = readln().split(" ")
            listPersons.add(Person(inputName, Gender.valueOf(inputGender)))
        }
        showAll()
    }

    fun showAll() {

        for (person in listPersons) {
            println(person)
        }
    }

    class Person(

        val namePerson: String,
        val genderPerson: Gender,
    ) {

        override fun toString(): String {
            return "Имя $namePerson - пол ${genderPerson.name}"
        }
    }
}

