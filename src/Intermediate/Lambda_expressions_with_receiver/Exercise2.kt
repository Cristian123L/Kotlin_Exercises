package Intermediate.Lambda_expressions_with_receiver

class Button {
    // Función que acepta un callback de extensión sobre ButtonEvent
    fun onEvent(action: ButtonEvent.() -> Unit) {
        // Simulamos un evento de botón, aquí un doble clic (no un clic derecho)
        val event = ButtonEvent(
            isRightClick = false,
            amount = 2,
            position = Position(100, 200)
        )

        // Ejecutamos el callback sobre el evento
        // Dentro de 'action', 'this' será el objeto 'event' creado arriba
        event.action()
    }
}
// Clase de datos que representa un evento de botón
data class ButtonEvent(
    val isRightClick: Boolean, // true si es clic derecho
    val amount: Int,           // número de clics
    val position: Position     // posición donde ocurrió el clic
)

// Clase de datos que representa una posición 2D
data class Position(
    val x: Int,
    val y: Int
)
// Función main: punto de entrada
fun main() {
    val button = Button() // Creamos un botón

    // Registramos un callback para los eventos del botón
    button.onEvent {
        // Dentro de este lambda, 'this' es el ButtonEvent simulado
        if (!isRightClick && amount == 2) {
            // Si no es clic derecho y es doble clic
            println("Double click!")
            // Imprime: Double click!
        }
    }
}


