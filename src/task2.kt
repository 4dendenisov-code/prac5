package task2

fun formatFullName(firstName: String?, lastName: String?, middleName: String?): String {
    val f = firstName ?: "[не указано]"
    val l = lastName ?: "[не указано]"
    val m = middleName ?: "[не указано]"
    return "$l $f $m"
}

fun main() {
    val firstName: String? = "Алексей"
    val lastName: String? = null
    val middleName: String? = "Петрович"

    println(formatFullName(firstName, lastName, middleName))
    println(formatFullName(firstName, "Иванов", middleName))
    println(formatFullName(firstName, null, null))
    println(formatFullName(null, null, null))
}