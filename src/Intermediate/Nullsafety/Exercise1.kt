package Intermediate.Nullsafety
data class User(val name: String?)

fun getNotificationPreferences(user: Any, emailEnabled: Boolean, smsEnabled: Boolean): List<String> {
    // Intentamos hacer un cast seguro a User; si falla, devolvemos lista vacía
    val validUser = user as? User ?: return emptyList()
    // Si el nombre del usuario es null, usamos "Guest" como valor predeterminado
    val userName = validUser.name ?: "Guest"

    // Construimos la lista de notificaciones habilitadas usando takeIf y listOfNotNull
    return listOfNotNull(
        "Email Notifications enabled for $userName".takeIf { emailEnabled },
        "SMS Notifications enabled for $userName".takeIf { smsEnabled }
    )
}

fun main() {
    val user1 = User("Alice")
    val user2 = User(null)
    val invalidUser = "NotAUser"

    println(getNotificationPreferences(user1, emailEnabled = true, smsEnabled = false))
    // [Email Notifications enabled for Alice]
    println(getNotificationPreferences(user2, emailEnabled = false, smsEnabled = true))
    // [SMS Notifications enabled for Guest]
    println(getNotificationPreferences(invalidUser, emailEnabled = true, smsEnabled = true))
    // []
}

/*
Conclusión:
Este ejemplo demuestra varias técnicas útiles de Kotlin para manejo seguro de tipos y valores nulos:
1. `as?` permite realizar un cast seguro, evitando excepciones si el objeto no es del tipo esperado.
2. El operador Elvis (`?:`) proporciona valores predeterminados para evitar `null`.
3. `listOfNotNull` junto con `takeIf` permite construir listas de manera concisa, incluyendo solo elementos que cumplen cierta condición.
En conjunto, estas herramientas facilitan escribir código seguro, limpio y expresivo.
*/
