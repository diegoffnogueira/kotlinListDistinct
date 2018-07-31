data class Produto (
        val nome: String = "",
        val produzido: String = "",
        val preco: Double = 0.0
)

fun main(args: Array<String>) {

    val productMap = hashMapOf("iPhone 8 Plus 64G" to  Produto("iPhone 8 Plus 64G", "Apple", 850.00),
            "Samsung Galaxy S8 64GB Unlocked Phone" to Produto("Samsung Galaxy S8 64GB Unlocked Phone", "Samsung", 699.99),
            "iPad Pro 9.7-inch 32 GB" to Produto("iPad Pro 9.7-inch 32 GB", "Apple", 474.98),
            "Samsung Electronics Ultra HD Smart LED TV" to Produto("Samsung Electronics Ultra HD Smart LED TV", "Samsung", 677.92),
            "Google Pixel Phone - 5 inch display" to Produto("Google Pixel Phone - 5 inch display", "Google", 279.95),
            "iPad Pro 9.7-inch 128G" to Produto("iPad Pro 9.7-inch 128G", "Apple", 574.99),
            "Google Wifi system 1-Pack" to Produto("Google Wifi system 1-Pack", "Google", 149.90),
            "Samsung Galaxy Tab 4" to Produto("Samsung Galaxy Tab 4", "Samsung", 127.67))

    productMap.forEach { println("${it.key} - ${it.value}") }

    println("----------")

    val maxPreco = productMap.maxBy { entry -> entry.value.preco }
    val minPreco = productMap.minBy { entry -> entry.value.preco }
    println(maxPreco)
    println("----------")
    println(minPreco)


    println("----------")
    val simpleMap = mapOf(4 to "quatro", 5 to "cinco")
    println(simpleMap)

    println("----------")
    val simpleMapPair = mapOf(Pair(4, "quatro"), Pair(3, "tres"), Pair(8, "oito"), Pair(5, "cinco"), Pair(9, "nove"))
    println(simpleMapPair)
    println(simpleMapPair.toSortedMap())

}