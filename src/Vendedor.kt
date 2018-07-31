data class Endereco(
        val rua: String = "",
        val bairro: String = ""
)

data class Vendedor(
        val nome: String = "",
        val idade: Int = 0,
        val endereco: Endereco
)

fun main(args: Array<String>) {

    val customerList = listOf(Vendedor("Davi", 30, Endereco("Rua Abreu", "Copacabana")),
            Vendedor("Carlos", 20, Endereco("Rua Caconde", "Bento Ribeiro")),
            Vendedor("Olivia", 35, Endereco("Rua Olinda", "Madureira")), null,
            Vendedor("Daniel", 18, Endereco("Rua Amarantes", "Marechal")), null)

    var strList = customerList.map { vendedor ->
        if (vendedor != null) {
            "${vendedor.nome} tem ${vendedor.idade} e mora na ${vendedor.endereco.rua} no bairro ${vendedor.endereco.bairro}"
        } else null
    }

    strList.filterNotNull().forEach { println(it) }
    println("-----------")

    println(strList.get(1))

    println("-----------")

    var strMutableList = mutableListOf<String>()
    customerList.mapTo(strMutableList) { vendedor ->
        if (vendedor != null) {
            "${vendedor.nome} tem ${vendedor.idade} e mora na ${vendedor.endereco.rua} no bairro ${vendedor.endereco.bairro}"
        } else "Nada consta para NULL"
    }

    strMutableList.forEach { println(it) }

    println("-----------")

    var strListNotNull = customerList.mapNotNull { vendedor ->
        if (vendedor != null) {
            "${vendedor.nome} tem ${vendedor.idade} e mora na ${vendedor.endereco.rua} no bairro ${vendedor.endereco.bairro}"
        } else null
    }

    strListNotNull.forEach { println(it) }

    println("-----------")

    strList = customerList.mapIndexed { index, vendedor ->
        if (vendedor != null) {
            "[$index] - ${vendedor.nome} tem ${vendedor.idade} e mora na ${vendedor.endereco.rua} no bairro ${vendedor.endereco.bairro}"
        } else null
    }

    strList.forEach { println(it) }

    println("-----------")

    strList = customerList.mapIndexedNotNull { index, vendedor ->
        if (vendedor != null) {
            "[$index] - ${vendedor.nome} tem ${vendedor.idade} e mora na ${vendedor.endereco.rua} no bairro ${vendedor.endereco.bairro}"
        } else null
    }

    strList.forEach { println(it) }

    println("-----------")
    strMutableList.clear()

    customerList.mapIndexedNotNullTo(strMutableList) { index, vendedor ->
        if (vendedor != null) {
            "[$index] - O ${vendedor.nome} safado tem ${vendedor.idade} e mora na ${vendedor.endereco.rua} no bairro ${vendedor.endereco.bairro}"
        } else null
    }

    strMutableList.forEach { println(it) }


    println("-----------")
    println("-----------")

    val customerList2 = listOf(listOf(1, 2), listOf("UM", "DOIS", "TRES"), listOf(
            Vendedor("Davi", 30, Endereco("Rua Abreu", "Copacabana")),
            Vendedor("Carlos", 20, Endereco("Rua Caconde", "Bento Ribeiro")),
            Vendedor("Olivia", 35, Endereco("Rua Olinda", "Madureira")), null,
            Vendedor("Daniel", 18, Endereco("Rua Amarantes", "Marechal")), null))

    strMutableList.clear()
    customerList2.forEach { println(it) }
    println("-----------")
    customerList2.flatten().forEach { println(it) }



}