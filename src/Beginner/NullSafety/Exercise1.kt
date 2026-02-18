package Beginner.NullSafety

data class Employee(val name: String, var salary: Int)
// Clase de datos para un empleado: nombre y salario

fun employeeById(id: Int) = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}
// Devuelve un Employee según el id, o null si no existe

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0
// ?. -> safe call: si employee es null, no falla
// ?: -> Elvis operator: si es null devuelve 0
// Devuelve el salario o 0 si no hay empleado

fun main() {
    println((1..5).sumOf { id -> salaryById(id) })
    // (1..5) → rango de ids
    // sumOf → suma los salarios de esos ids
    // Imprime el total de salarios
}
