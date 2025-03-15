package org.example.lesson_2

import kotlin.math.pow

const val NUMBE_100 = 100
fun main () {

    val bankClient = 70_000.0
    val procentRate = 16.7
    val years = 20.0

    val summaInBankClient = bankClient * (1 + (procentRate / NUMBE_100)).pow(years)
    val formatedSumma = String.format("Сумма на конец срока: %.3f", summaInBankClient)

    println(formatedSumma)
}