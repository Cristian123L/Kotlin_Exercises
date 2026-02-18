package Beginner.controlFlow.Ranges

fun main() {

    val words = listOf("dinosaur", "limousine", "magazine", "language")
    // val: variable inmutable (no puede cambiar)
    // listOf(): crea una lista
    // words es una lista de Strings
    for (w in words) {
        // for: recorre cada elemento de la lista
        // w toma el valor de cada palabra en cada iteración
        if (w.startsWith("l"))
        // if: estructura condicional
        // startsWith(): función que verifica si el String empieza con "l"

            println(w)
        // imprime la palabra si cumple la condición
    }
}
