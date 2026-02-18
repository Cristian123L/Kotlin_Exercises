package Intermediate.Properties
fun checkAppServer(): Boolean {
    println("Performing application server health check...")
    return true
}
fun checkDatabase(): Boolean {
    println("Performing database health check...")
    return false
}

fun main() {
    val isAppServerHealthy by lazy { checkAppServer() }
    val isDatabaseHealthy by lazy { checkDatabase() }

    when {
        isAppServerHealthy -> println("Application server is online and healthy")
        isDatabaseHealthy -> println("Database is healthy")
        else -> println("System is offline")
    }
}
/*
Conclusión:
Este ejemplo muestra cómo usar **propiedades lazy** en Kotlin para retrasar la ejecución de código hasta que realmente se necesite.
`isAppServerHealthy` y `isDatabaseHealthy` solo se calculan al acceder a ellas, lo que mejora la eficiencia y evita llamadas innecesarias.
El flujo con `when` permite tomar decisiones basadas en la salud de diferentes componentes del sistema de manera clara y concisa.
*/
