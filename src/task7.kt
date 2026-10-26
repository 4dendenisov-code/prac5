package task7

fun main() {
    println("Введите имя:")
    val name = readln().takeIf { it.isNotBlank() }

    println("Введите возраст:")
    val age = readln().takeIf { it.isNotBlank() }?.toIntOrNull()

    println("Введите город:")
    val city = readln().takeIf { it.isNotBlank() }

    val nameText = name ?: "гость"
    val ageText = age?.let { "$it лет" } ?: "возраст не указан"
    val cityText = city ?: "город неизвестен"

    println("Привет, $nameText! Тебе $ageText, ты из города: $cityText.")
}