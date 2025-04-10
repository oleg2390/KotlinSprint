package org.example.lesson_16

class Order(

    private val numberOrder: Int,
) {

    private var statusOrder = "принят"

    private fun updateStatus(newStatusOrder: String) {
        statusOrder = newStatusOrder
        println("статус заказа: $numberOrder обновлен: $statusOrder")
    }

    fun sendStatusResponse(newStatusOrder: String) {
        println("запрос на изменение статуса заказа: $numberOrder ")
        updateStatus(newStatusOrder)
    }

    fun printStatus() {
        println("заказ: $numberOrder статус: $statusOrder")
    }
}