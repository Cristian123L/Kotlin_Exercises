package Intermediate.Objects
data class Temperature(val celsius: Double) {
    // Propiedad calculada que convierte la temperatura de Celsius a Fahrenheit
    val fahrenheit: Double = celsius * 9 / 5 + 32

    companion object {
        // Función de fábrica que crea un objeto Temperature a partir de Fahrenheit
        fun fromFahrenheit(fahrenheit: Double): Temperature = Temperature((fahrenheit - 32) * 5 / 9)
    }
}

fun main() {
    val fahrenheit = 90.0
    val temp = Temperature.fromFahrenheit(fahrenheit)
    println("${temp.celsius}°C is $fahrenheit °F")
}
/*
Conclusión:
Este ejemplo demuestra cómo usar un **companion object** para crear métodos de fábrica en Kotlin,
permitiendo construir instancias de una clase de manera alternativa (en este caso, a partir de Fahrenheit).
La clase `Temperature` también muestra cómo definir propiedades calculadas (`fahrenheit`) basadas en otras propiedades.
Esto permite encapsular la lógica de conversión de temperatura de forma clara y mantener la inmutabilidad de los datos.
*/
