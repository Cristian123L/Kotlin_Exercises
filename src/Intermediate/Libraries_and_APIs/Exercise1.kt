package Intermediate.Libraries_and_APIs
import kotlin.math.*

// Función para calcular el interés compuesto
fun calculateCompoundInterest(P: Double, r: Double, n: Int, t: Int): Double {
    // Fórmula: A = P * (1 + r/n)^(n*t)
    return P * (1 + r / n).pow(n * t)
}

fun main() {
    val principal = 1000.0       // Capital inicial
    val rate = 0.05              // Tasa de interés anual (5%)
    val timesCompounded = 4      // Número de veces que se capitaliza por año
    val years = 5                // Número de años
    val amount = calculateCompoundInterest(principal, rate, timesCompounded, years)
    println("The accumulated amount is: $amount")
    // The accumulated amount is: 1282.0372317085844
}

/*
Conclusión:
Este ejemplo ilustra cómo calcular **interés compuesto** en Kotlin utilizando la función `pow` de la librería `kotlin.math`.
La fórmula considera el capital inicial, la tasa de interés, la frecuencia de capitalización y el tiempo en años, devolviendo el monto acumulado.
Es un ejemplo práctico de cómo implementar fórmulas matemáticas financieras de manera clara y precisa en Kotlin.
*/
