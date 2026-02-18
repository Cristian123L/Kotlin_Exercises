package Intermediate.ExtensionFunctions

// Esta es una función de extensión para la clase Int
// 'fun Int.isPositive()' significa que estamos agregando una función llamada 'isPositive' a todos los enteros
// 'this' dentro de la función hace referencia al valor del entero que está llamando la función
fun Int.isPositive(): Boolean = this > 0
// La función devuelve 'true' si el entero es mayor que 0, de lo contrario devuelve 'false'

// Función main: punto de entrada del programa
fun main() {
    // Llamamos a la función de extensión 'isPositive' sobre el entero 1
    println(1.isPositive())
    // Imprime 'true' porque 1 es mayor que 0
}
