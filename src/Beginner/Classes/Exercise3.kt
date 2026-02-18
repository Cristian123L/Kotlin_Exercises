package Beginner.Classes

import kotlin.random.Random
// Librería para generar números aleatorios

data class Employee3(val name: String, var salary: Int)
// Clase de datos para un empleado

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")
    // Lista de nombres posibles

    fun generateEmployee() =
        Employee3(
            names.random(),
            Random.nextInt(from = minSalary, until = maxSalary)
        )
    // Genera un empleado con nombre aleatorio y salario aleatorio dentro del rango
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    // Crea generador con salario entre 10 y 30

    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    // Genera y muestra 3 empleados aleatorios

    empGen.minSalary = 50
    empGen.maxSalary = 100
    // Cambia el rango de salario

    println(empGen.generateEmployee())
    // Genera un empleado con el nuevo rango
}

