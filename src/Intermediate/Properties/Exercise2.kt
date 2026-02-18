package Intermediate.Properties
// Propiedad de extensión para Double que convierte kilómetros a millas
val Double.asMiles: Double
    get() = this * 0.621371 // 'this' se refiere al valor Double sobre el que se llama la propiedad
fun main() {
    val distanceKm = 5.0
    println("$distanceKm km is ${distanceKm.asMiles} miles")
    val marathonDistance = 42.195
    println("$marathonDistance km is ${marathonDistance.asMiles} miles")
}
/*
Conclusión:
Este ejemplo muestra cómo crear **propiedades de extensión** en Kotlin para agregar funcionalidades a tipos existentes sin modificarlos.
`asMiles` permite convertir cualquier valor `Double` de kilómetros a millas de manera directa y legible, mostrando cómo Kotlin facilita escribir código expresivo y reutilizable.
*/
