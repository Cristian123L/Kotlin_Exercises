package Beginner.Functions
import kotlin.math.PI

fun circleArea(radius: Int): Double {
    // radius: parámetro entero
    // : Double → la función devuelve un número decimal
    return PI * radius * radius
    // return: devuelve el resultado
    // Fórmula del área: π * radio²
}

fun main() {
    // función principal del programa
    println(circleArea(2))
    // llama a la función con radio 2 y muestra el resultado
}


