package org.example.lesson_17

class ElementQuiz(

    question: String,
    answer: String,
) {
    var question: String = question
        get() = field
        set(value) {
            field = value
        }

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}