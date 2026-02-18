package Intermediate.ScopeFunctions

// Clase de datos que representa un usuario con un ID y un email
data class User(val id: Int, var email: String)
// Función que actualiza el email de un usuario y devuelve el mismo usuario
fun updateEmail(user: User, newEmail: String): User = user.apply {
    // 'apply' ejecuta un bloque sobre 'user' y devuelve 'user' al final
    // Dentro de este bloque, 'this' se refiere a 'user'
    this.email = newEmail  // Actualizamos el email del usuario
}.also {
    // 'also' permite realizar una acción adicional con el objeto (como imprimir)
    // Devuelve el mismo objeto al final
    println("Updating email for user with ID: ${it.id}") // Imprime mensaje
}
// Función main: punto de entrada
fun main() {
    val user = User(1, "old_email@example.com") // Creamos un usuario
    val updatedUser = updateEmail(user, "new_email@example.com")
    // Llama a updateEmail:
    // 1. Cambia el email a "new_email@example.com"
    // 2. Imprime: Updating email for user with ID: 1
    // 3. Devuelve el mismo objeto actualizado y lo asigna a updatedUser

    println("Updated User: $updatedUser")
    // Imprime: Updated User: User(id=1, email=new_email@example.com)
}
