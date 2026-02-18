package Intermediate.Lambda_expressions_with_receiver

// Función de extensión para List<Int>
// Devuelve una nueva lista donde cada elemento se incrementa en 1
fun List<Int>.incremented(): List<Int> {
    val originalList = this // 'this' se refiere a la lista que llama a la función
    return buildList {
        // 'buildList' crea una nueva lista mutable y luego la devuelve como lista inmutable
        for (n in originalList) add(n + 1)
        // Iteramos cada número 'n' en la lista original y agregamos 'n+1' a la nueva lista
    }
}

// Función main: punto de entrada
fun main() {
    val originalList = listOf(1, 2, 3) // Lista original
    val newList = originalList.incremented()
    // Llamamos a la función de extensión que devuelve [2, 3, 4]

    println(newList)
    // Imprime: [2, 3, 4]
}
