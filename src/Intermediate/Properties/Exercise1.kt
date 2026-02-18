package Intermediate.Properties
fun findOutOfStockBooks(inventory: List<Int>): List<Int> = buildList {
    // Iteramos por los índices de la lista de inventario
    for (index in inventory.indices) {
        // Si la cantidad en inventario es 0, significa que el libro está agotado
        if (inventory[index] == 0) {
            add(index) // Agregamos el índice del libro agotado a la nueva lista
        }
    }
}

fun main() {
    val inventory = listOf(3, 0, 7, 0, 5) // Lista de inventario de libros
    println(findOutOfStockBooks(inventory))
    // [1, 3]
}

/*
Conclusión:
Este ejemplo demuestra cómo usar `buildList` para crear listas nuevas de forma concisa y eficiente.
Se recorre la lista original y se filtran los libros agotados, guardando solo sus índices.
El resultado es una lista inmutable que representa los elementos que cumplen cierta condición, mostrando cómo Kotlin facilita la creación de listas derivadas sin modificar la original.
*/
