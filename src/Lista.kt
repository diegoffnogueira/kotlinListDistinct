data class Lista (
        val nome: String = ""
)

fun main(args: Array<String>) {

    val simpleList = listOf(1, 2, 3, 4, 5, 6)

    var intResult = simpleList.reduce { acc, it -> println("acc = ${acc}, it = ${it}"); acc + it}

    println(intResult)

    println()

    intResult = simpleList.reduceIndexed { index, acc, it -> println("acc = ${acc}, it = ${it}");
        if(index == 1) acc else acc + it }

    println(intResult)

}