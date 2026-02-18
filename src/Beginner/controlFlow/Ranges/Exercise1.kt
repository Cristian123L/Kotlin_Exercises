package Beginner.controlFlow.Ranges

fun main() {

    var pizzaSlices = 0 // Variable mutable (var) inicializada en 0

    while (pizzaSlices < 7) { // Bucle que se ejecuta mientras la condición sea verdadera
        pizzaSlices++ // Operador de incremento: suma 1 a la variable
        println("There's only $pizzaSlices slice/s of pizza :(")
        // println imprime en consola
        // $pizzaSlices es interpolación de variable dentro del String
    }

    pizzaSlices++ // Se incrementa una vez más fuera del while
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza!")
    // Mensaje final cuando ya no se cumple la condición del while
}
