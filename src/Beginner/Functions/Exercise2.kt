package Beginner.Functions
import kotlin.math.PI

fun main() {
    println(circleArea2(2))
    // imprime el área del círculo con radio 2
}
fun circleArea2(radius: Int): Double = PI * radius * radius
// función de expresión única
// no necesita llaves ni return
// Kotlin devuelve automáticamente el resultado


