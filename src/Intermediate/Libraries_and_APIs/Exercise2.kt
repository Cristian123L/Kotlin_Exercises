package Intermediate.Libraries_and_APIs
import kotlin.time.measureTime

fun main() {
    // 'measureTime' ejecuta un bloque de código y devuelve el tiempo que tardó
    val timeTaken = measureTime {
        // Simulación de procesamiento de datos
        val data = List(1000) { it * 2 }                // Creamos una lista de 1000 elementos
        val filteredData = data.filter { it % 3 == 0 } // Filtramos los múltiplos de 3

        // Procesamiento adicional de los datos filtrados
        val processedData = filteredData.map { it / 2 }
        println("Processed data")
    }

    println("Time taken: $timeTaken") // e.g. 16 ms
}

/*
Conclusión:
Este ejemplo muestra cómo medir el **tiempo de ejecución** de un bloque de código en Kotlin usando `measureTime`.
Es útil para analizar el rendimiento de operaciones como filtrado y mapeo de listas grandes, ayudando a identificar cuellos de botella y optimizar procesos.
`measureTime` devuelve un `Duration`, ofreciendo una forma precisa y sencilla de medir tiempos en aplicaciones Kotlin.
*/
