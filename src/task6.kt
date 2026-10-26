package task6

data class UserProfile(
    val username: String,
    val bio: String?,
    val age: Int?,
    val city: String?,
    val isVerified: Boolean
)

fun generateProfileCard(user: UserProfile): String {
    val verifiedMark = if (user.isVerified) " ✅" else ""
    val bioLine = user.bio?.let { "О себе: $it\n" } ?: ""
    val ageText = user.age?.toString() ?: "не указан"
    val cityText = user.city ?: "неизвестен"

    return """
        |👤 ${user.username}$verifiedMark
        |$bioLine|Возраст: $ageText
        |Город: $cityText
    """.trimMargin()
}

fun main() {
    val users = listOf(
        UserProfile("alex_dev", "Kotlin-разработчик", 28, "Москва", true),
        UserProfile("maria_k", null, null, "Санкт-Петербург", false),
        UserProfile("anon", null, 19, null, false)
    )

    for (u in users) {
        println(generateProfileCard(u))
        println("-------------------")
    }
}