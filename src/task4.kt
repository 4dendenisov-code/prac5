package task4

data class Product(val name: String, val price: Double, val quantity: Int)

fun printReceipt(products: List<Product>) {
    println("========== ЧЕК ==========")
    var total = 0.0
    for (p in products) {
        val sum = p.price * p.quantity
        total += sum
        println("Товар: ${p.name} | Цена: ${String.format("%.2f", p.price)}₽ | Кол-во: ${p.quantity} | Сумма: ${String.format("%.2f", sum)}₽")
    }
    println("=========================")
    println("ИТОГО: ${String.format("%.2f", total)}₽")
    println("=========================")
}

fun main() {
    val products = listOf(
        Product("Хлеб", 45.50, 2),
        Product("Молоко", 89.90, 1),
        Product("Сыр", 320.00, 1)
    )
    printReceipt(products)
}