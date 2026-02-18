package Beginner.Classes

data class Employee1(val name: String, var salary: Int)
// data class: clase especial que almacena datos
// Kotlin genera automáticamente:
//   - toString()
//   - equals()
//   - hashCode()
//   - copy()
//   - componentN()
// val name: propiedad inmutable (no cambia)
// var salary: propiedad mutable (sí puede cambiar)

fun main() {

    val emp = Employee1("Mary", 20)
    // Se crea un objeto (instancia) de Employee
    // name = "Mary"
    // salary = 20

    println(emp)
    // Al ser data class, imprime automáticamente:
    // Employee(name=Mary, salary=20)

    emp.salary += 10
    // += 10 aumenta el salario en 10
    // Equivale a: emp.salary = emp.salary + 10

    println(emp)
    // Ahora imprime:
    // Employee(name=Mary, salary=30)
}
