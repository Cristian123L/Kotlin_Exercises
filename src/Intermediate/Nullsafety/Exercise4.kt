package Intermediate.Nullsafety
// Función que valida si la cantidad solicitada está disponible en stock
fun validateStock(requested: Int?, available: Int?): Int {
    // Si alguno de los valores es null, devolvemos -1
    val validRequested = requested ?: return -1
    val validAvailable = available ?: return -1

    // No se permiten cantidades negativas
    if (validRequested < 0) return -1
    // La cantidad solicitada no puede exceder el stock disponible
    if (validRequested > validAvailable) return -1

    // Si todas las validaciones pasan, devolvemos la cantidad solicitada
    return validRequested
}

fun main() {
    println(validateStock(5,10))
    // 5
    println(validateStock(null,10))
    // -1
    println(validateStock(-2,10))
    // -1
}

/*
Conclusión:
Este ejemplo muestra cómo combinar **operadores de seguridad ante null (`?:`)** y validaciones simples para garantizar que los valores de entrada sean correctos antes de procesarlos.
Se asegura que la cantidad solicitada no sea nula, negativa ni mayor al stock disponible, devolviendo un valor indicativo (-1) en caso de error.
Esto permite manejar errores de manera clara y mantener la integridad de los datos de inventario.
*/
