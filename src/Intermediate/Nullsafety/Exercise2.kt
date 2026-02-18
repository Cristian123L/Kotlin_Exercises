package Intermediate.Nullsafety
data class Subscription(val name: String, val isActive: Boolean)
// Devuelve la suscripción activa si existe exactamente una, de lo contrario null
fun getActiveSubscription(subscriptions: List<Subscription>): Subscription? =
    subscriptions.singleOrNull { it.isActive }

fun main() {
    val userWithPremiumPlan = listOf(
        Subscription("Basic Plan", false),
        Subscription("Premium Plan", true)
    )
    val userWithConflictingPlans = listOf(
        Subscription("Basic Plan", true),
        Subscription("Premium Plan", true)
    )
    println(getActiveSubscription(userWithPremiumPlan))
    println(getActiveSubscription(userWithConflictingPlans))
}

/*
Conclusión:
Este ejemplo ilustra el uso de la función `singleOrNull` de Kotlin para obtener un elemento único que cumpla una condición.
Si existe exactamente una suscripción activa, se devuelve; si no hay ninguna o hay varias, se devuelve null.
Esto permite manejar situaciones de manera segura y clara, evitando errores en listas con múltiples coincidencias o ausencia de elementos.
*/
