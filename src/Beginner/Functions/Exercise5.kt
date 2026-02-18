package Beginner.Functions

fun repeatN(n: Int, action: () -> Unit) {
    // n: cantidad de veces que se repetirá la acción action: parámetro que recibe una FUNCIÓN
    // () -> Unit significa:
    //   no recibe parámetros ()
    //   no devuelve nada (Unit)
    for (i in 1..n) {
        // for: recorre un rango
        // 1..n incluye ambos extremos
        action()
        // se ejecuta la función que se pasó como argumento
    }
}

fun main() {
    repeatN(5) {
        // Se llama a repeatN con n = 5
        // Lo que está entre llaves es una lambda
        // Esta lambda coincide con el tipo () -> Unit
        println("Hello")
        // Esto se ejecutará 5 veces
    }
}
