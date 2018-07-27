data class Cliente(
        val nome: String = "",
        val idade: Int = 0
)

fun main(args: Array<String>) {

    val simpleList = listOf(1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8, 9)

    println("Lista normal => ${simpleList}")
    println()
    println("Lista sem repetição => ${simpleList.distinct()}")
    println()
    println("máximo numero da lista => ${simpleList.max()}")

    val clientList = mutableListOf(
            Cliente("Diego", 30),
            Cliente("Robson", 49),
            Cliente("Casemiro", 35),
            Cliente("Casemiro", 35)
    )

    println()
    clientList.distinct().forEach { println(it) }
    println()
    println("Máximo cliente: ${clientList.maxBy { cliente -> cliente.idade }}")
    println()

    val clientListName = mutableListOf(
            Cliente("Diego", 30),
            Cliente("Robson", 49),
            Cliente("Casemiro", 35),
            Cliente("Casemiro", 12),
            Cliente("Casemiro", 36),
            Cliente("Casemiro", 37),
            Cliente("Robson", 15)
    )

    println()

    clientListName.distinctBy { cliente -> cliente.nome }.forEach { println(it) }

}