package Intermediate.Nullsafety
data class User(val username: String, val isActive: Boolean)

// Devuelve una lista de nombres de usuario activos
fun getActiveUsernames(users: List<User>): List<String> {
    return users.mapNotNull { user ->
        if (user.isActive) user.username else null
        // 'mapNotNull' descarta automáticamente los valores null
    }
}

fun main() {
    val allUsers = listOf(
        User("alice123", true),
        User("bob_the_builder", false),
        User("charlie99", true)
    )

    println(getActiveUsernames(allUsers))
    // [alice123, charlie99]
}

/*
Conclusión:
Este ejemplo demuestra cómo usar `mapNotNull` en Kotlin para transformar y filtrar listas de manera concisa.
Se recorren todos los usuarios y solo se incluyen los nombres de los que están activos, descartando los inactivos automáticamente.
Esto permite combinar mapeo y filtrado en una sola operación, manteniendo el código limpio y eficiente.
*/
