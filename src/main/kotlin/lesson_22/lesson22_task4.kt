package org.example.lesson_22

fun main() {

    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData()
}

class MainScreenViewModel() {

    data class MainScreen(
        val data: String = "",
        val isLoading: Boolean = false,
    )

    var mainScreenViewModel = MainScreen()
        private set

    fun loadData() {

        println("Отсутвие данных: $mainScreenViewModel")

        mainScreenViewModel = mainScreenViewModel.copy(isLoading = true)
        println("индикатор загрузки: $mainScreenViewModel")

        val loadData = "загрузка данных"

        mainScreenViewModel = mainScreenViewModel.copy(data = loadData, isLoading = false)
        println("загрузка завершена: $mainScreenViewModel")
    }
}