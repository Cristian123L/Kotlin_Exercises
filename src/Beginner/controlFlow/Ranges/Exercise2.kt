package Beginner.controlFlow.Ranges

fun main() {
    for (number in 1..100) {
        // for: bucle que recorre un rango
        // 1..100: rango cerrado (incluye 1 y 100)
        println(
            when {
                // when: estructura condicional (similar a switch)
                number % 15 == 0 -> "fizzbuzz"
                // % es el operador módulo (resto de división)
                // Si es divisible por 15 imprime "fizzbuzz"
                number % 3 == 0 -> "fizz"
                // Si es divisible por 3 imprime "fizz"
                number % 5 == 0 -> "buzz"
                // Si es divisible por 5 imprime "buzz"
                else -> "$number"
                // else: si no cumple ninguna condición
                // $number: interpolación de variable
            }
        )
    }
}
