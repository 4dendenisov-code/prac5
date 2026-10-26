package task1

fun main() {
    val cityName = "Москва"
    val foundingYear = 1147
    var temperature = 5.5
    val isCapital = true

    println("Город: $cityName, основан в $foundingYear году. Температура: $temperature°C. Столица: ${if (isCapital) "да" else "нет"}")

    temperature = 12.3
    println("Город: $cityName, основан в $foundingYear году. Температура: $temperature°C. Столица: ${if (isCapital) "да" else "нет"}")
}