package Intermediate.Classes_and_interfaces

interface Messenger {
    fun sendMessage(message: String)
    fun receiveMessage(): String
}

class BasicMessenger : Messenger {
    override fun sendMessage(message: String) {
        println("Sending message: $message")
    }

    override fun receiveMessage(): String {
        return "You've got a new message!"
    }
}

class SmartMessenger(val basicMessenger: BasicMessenger) : Messenger by basicMessenger {
    override fun sendMessage(message: String) {
        println("Sending a smart message: $message")
        basicMessenger.sendMessage("[smart] $message")
    }
}

fun main() {
    val basicMessenger = BasicMessenger()
    val smartMessenger = SmartMessenger(basicMessenger)

    basicMessenger.sendMessage("Hello!")
    // Sending message: Hello!
    println(smartMessenger.receiveMessage())
    // You've got a new message!
    smartMessenger.sendMessage("Hello from SmartMessenger!")
    // Sending a smart message: Hello from SmartMessenger!
    // Sending message: [smart] Hello from SmartMessenger!
}

/*
Conclusión:
Este ejemplo demuestra el uso de **delegación de interfaces** en Kotlin.
La clase `SmartMessenger` delega la implementación de `Messenger` a un objeto `BasicMessenger`, lo que permite reutilizar su funcionalidad sin herencia directa.
Al mismo tiempo, `SmartMessenger` puede **sobrescribir métodos específicos** como `sendMessage` para agregar comportamiento adicional, manteniendo el resto de la funcionalidad delegada intacta.
Esto muestra cómo Kotlin facilita la composición y la extensión de comportamientos de manera flexible y limpia.
*/
