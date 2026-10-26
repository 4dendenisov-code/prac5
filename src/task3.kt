package task3

import kotlin.math.roundToInt

fun describeValue(value: Any): String {
    return when (value) {
        is Int -> "Целое число: $value, квадрат: ${value * value}"
        is Double -> "Дробное число: $value, округлённое: ${value.roundToInt()}"
        is String -> "Строка: $value, длина: ${value.length}"
        is Boolean -> "Логическое: $value, инвертированное: ${!value}"
        else -> "Неизвестный тип: ${value::class.simpleName}"
    }
}

fun main() {
    println(describeValue(42))
    println(describeValue(3.14))
    println(describeValue("Kotlin"))
    println(describeValue(true))
    println(describeValue('A'))
}