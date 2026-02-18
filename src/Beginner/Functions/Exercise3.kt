package Beginner.Functions

fun intervalInSeconds(
    hours: Int = 0,
    minutes: Int = 0,
    seconds: Int = 0
) =
    ((hours * 60) + minutes) * 60 + seconds
// parámetros con valor por defecto (si no se envían, valen 0)
// convierte horas → minutos → segundos
// función de expresión única (sin return)
fun main() {

    println(intervalInSeconds(1, 20, 15))
    // usa todos los argumentos (1h 20m 15s)
    println(intervalInSeconds(minutes = 1, seconds = 25))
    // argumentos nombrados (no importa el orden)
    println(intervalInSeconds(hours = 2))
    // solo horas, minutos y segundos valen 0
    println(intervalInSeconds(minutes = 10))
    // solo minutos
    println(intervalInSeconds(hours = 1, seconds = 1))
    // combinación de argumentos nombrados
}

