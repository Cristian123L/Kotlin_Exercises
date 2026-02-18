package Intermediate.Lambda_expressions_with_receiver
// Función que simula la recepción de datos y acepta un callback de extensión para StringBuilder
fun fetchData(callback: StringBuilder.() -> Unit) {
    // Creamos un StringBuilder con contenido inicial
    val builder = StringBuilder("Data received")

    // Llamamos al callback, que es una función de extensión de StringBuilder
    // Dentro del callback, 'this' será el 'builder' creado arriba
    builder.callback()
}
// Función main: punto de entrada del programa
fun main() {
    // Llamamos a fetchData y le pasamos un bloque lambda
    fetchData {
        // 'this' se refiere al StringBuilder creado dentro de fetchData

        append(" - Processed") // Modifica el StringBuilder agregando texto
        println(this.toString()) // Imprime: "Data received - Processed"
    }
}
