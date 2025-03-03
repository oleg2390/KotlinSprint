package org.example.lesson_1

const val MAGIC_NUMBER = 60
fun main () {
    val second: Long = 6480//колличество секунда Гагарина в космосе

    val resultOfMinute = second / MAGIC_NUMBER

    val resulOfHour = resultOfMinute / MAGIC_NUMBER
    val resulOfHourBalance = resultOfMinute % MAGIC_NUMBER
    val resultOfMinuteBalance = second % MAGIC_NUMBER
    val result = String.format("%02d", resulOfHour) //сделал разными способоми
    val formatedNum = resultOfMinuteBalance.toString().padStart(2, '0')


    println("Гагарин провел в космосе $result:$resulOfHourBalance:$formatedNum")

}