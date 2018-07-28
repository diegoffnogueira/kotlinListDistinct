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

    val listName = mutableListOf(
            Cliente("Diego", 30),
            Cliente("Robson", 49),
            Cliente("Davi", 35),
            Cliente("Daniel", 12),
            Cliente("Casemiro", 36)
    )

    val int = listName.filter { cliente -> cliente.nome.startsWith("D") }.sumBy { cliente -> cliente.idade }

    println("-------")
    println(int)

    println("-------")
    println(simpleList.filter { it % 2 == 0 })
    println(simpleList.distinct().filter { it % 3 == 0 })

    println("-------")
    val listaNova = mutableListOf(100)
    simpleList.distinct().filterTo(listaNova, predicate = { it % 2 == 0 })
    println(listaNova)

    println("-------")
    listaNova.clear()
    listaNova.add(25)
    simpleList.filterNotTo(listaNova, predicate = { it % 2 == 0 })
    println(listaNova)

    println("-------")
    val simpleList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(simpleList2.filterIndexed { index, it -> index !in 3..6})

    println("-------")
    listaNova.clear()
    listaNova.add(99)
    val simpleList3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(simpleList3.filterIndexedTo(listaNova, predicate = {index, i -> index in 3..6 }))


    println("-------")
    val simpleList4 = mutableListOf(99, 77, 66, "quatro", "cinco", "seis", null,
            Cliente("Dani", 30),
            Cliente("Osvaldo", 49),
            Cliente("Pati", 35), null)
    println(simpleList4.filterIsInstance<Int>())
    println(simpleList4.filterIsInstance<String>())
    println(simpleList4.filterIsInstance<Cliente>())


    println("-------")
    val simpleList5 = mutableListOf("um", "dois", "tres")
    println(simpleList4.filterIsInstanceTo(simpleList5))
    println(simpleList4.filterIsInstanceTo(listaNova))
    println(simpleList4.filterIsInstanceTo(clientList))

    println("-------")
    val mixList = simpleList4.filterNot { any -> any is Int }
    println(mixList)

    println("-------")
    val mixList2 = simpleList4.filterNot { any -> any is String }
    println(mixList2)

    println("-------")
    val mixList3 = simpleList4.filterNot { any -> any is Cliente }
    println(mixList3)

    println("-------")
    val mixList4 = simpleList4.filterNot { any -> any is Cliente }.filterNotNull()
    println(mixList4)

    println("-------")
    val mixList5 = mutableListOf<Any>()
    simpleList4.filterNot { any -> any is Int }.filterNotNullTo(mixList5)
    println("mixList5 => ${mixList5}")


}