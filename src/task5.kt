package task5

fun calculateDiscountedPrice(originalPrice: Double?, discountPercent: Int?): String {
    val price = originalPrice ?: return "Цена не указана"
    val discount = when {
        discountPercent == null || discountPercent < 0 -> 0
        discountPercent > 100 -> 100
        else -> discountPercent
    }
    val finalPrice = price - price * discount / 100.0
    return "Цена: ${String.format("%.2f", price)}₽, скидка: $discount%, итог: ${String.format("%.2f", finalPrice)}₽"
}

fun main() {
    println(calculateDiscountedPrice(null, null))
    println(calculateDiscountedPrice(null, 20))
    println(calculateDiscountedPrice(1000.0, null))
    println(calculateDiscountedPrice(1000.0, 25))
}