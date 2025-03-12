package org.example.lesson_2

fun main () {

    val staff = 50
    val intern = 30
    val salaryStaff = 30_000
    val salaryIntern = 20_000

    val allExpensesStaff = staff * salaryStaff
    val allExpenses = allExpensesStaff + (intern * salaryIntern)
    val averageAllStaff = allExpenses / (staff + intern)

    println("Расходы на выплату зарплаты постоянных сотрудников - $allExpensesStaff")
    println("Общие расходы по ЗП после прихода стажеров - $allExpenses")
    println("Среднюю ЗП одного сотрудника после устройства стажеров - $averageAllStaff")
}