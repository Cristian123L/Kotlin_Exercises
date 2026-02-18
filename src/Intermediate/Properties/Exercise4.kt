package Intermediate.Properties
import kotlin.properties.Delegates.observable

class Budget(val totalBudget: Int) {
    var remainingBudget: Int by observable(totalBudget) { _, oldValue, newValue ->
        // Se ejecuta cada vez que 'remainingBudget' cambia
        if (newValue < totalBudget * 0.2) {
            println("Warning: Your remaining budget ($newValue) is below 20% of your total budget.")
        } else if (newValue > oldValue) {
            println("Good news: Your remaining budget increased to $newValue.")
        }
    }
}

fun main() {
    val myBudget = Budget(totalBudget = 1000)

    myBudget.remainingBudget = 800
    myBudget.remainingBudget = 150
    myBudget.remainingBudget = 50
    myBudget.remainingBudget = 300
}
/*
Conclusión:
Este ejemplo muestra cómo usar **Delegates.observable** en Kotlin para monitorear cambios en propiedades.
Cada vez que `remainingBudget` se actualiza, se ejecuta un bloque que permite reaccionar automáticamente a condiciones importantes, como quedarse por debajo del 20% del presupuesto o un aumento en el mismo.
Esto facilita implementar lógica reactiva y mantener el código limpio, evitando la necesidad de revisar manualmente los valores después de cada cambio.
*/
