package Intermediate.Objects
interface Order {
    val orderId: String
    val customerName: String
    val orderTotal: Double
}

data object OrderOne: Order {
    override val orderId = "001"
    override val customerName = "Alice"
    override val orderTotal = 15.50
}

data object OrderTwo: Order {
    override val orderId = "002"
    override val customerName = "Bob"
    override val orderTotal = 12.75
}

fun main() {
    // Print the name of each data object
    println("Order name: $OrderOne")
    // Order name: OrderOne
    println("Order name: $OrderTwo")
    // Order name: OrderTwo

    // Check if the orders are identical
    println("Are the two orders identical? ${OrderOne == OrderTwo}")
    // Are the two orders identical? false

    if (OrderOne == OrderTwo) {
        println("The orders are identical.")
    } else {
        println("The orders are unique.")
        // The orders are unique.
    }

    println("Do the orders have the same customer name? ${OrderOne.customerName == OrderTwo.customerName}")
    // Do the orders have the same customer name? false
}

/*
Conclusión:
Este ejemplo muestra cómo Kotlin permite usar **data objects** para representar instancias únicas con comportamiento de datos.
Cada `Order` (OrderOne y OrderTwo) es un objeto singleton que implementa la interfaz `Order`, asegurando propiedades inmutables como `orderId`, `customerName` y `orderTotal`.
Los data objects ofrecen comparación estructural (`==`) y un `toString()` útil, lo que facilita verificar igualdad y mostrar información.
Esto demuestra cómo Kotlin combina **singletoneidad y funcionalidades de data class**, permitiendo modelar objetos únicos de manera concisa y segura.
*/

