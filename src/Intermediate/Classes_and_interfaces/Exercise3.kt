package Intermediate.Classes_and_interfaces

interface Refundable {
    fun refund(amount: Double)
}

abstract class PaymentMethod(val name: String) {
    fun authorize(amount: Double) {
        println("Authorizing payment of $$amount.")
    }

    abstract fun processPayment(amount: Double)
}

class CreditCard(name: String) : PaymentMethod(name), Refundable {
    override fun processPayment(amount: Double) {
        println("Processing credit card payment of $$amount.")
    }

    override fun refund(amount: Double) {
        println("Refunding $$amount to the credit card.")
    }
}

fun main() {
    val visa = CreditCard("Visa")

    visa.authorize(100.0)
    // Authorizing payment of $100.0.
    visa.processPayment(100.0)
    // Processing credit card payment of $100.0.
    visa.refund(50.0)
    // Refunding $50.0 to the credit card.
}

/*
Conclusión:
Este ejemplo muestra cómo combinar **clases abstractas** e **interfaces** para crear un diseño flexible y reutilizable.
La clase abstracta `PaymentMethod` define un comportamiento común para todos los métodos de pago, mientras que la interfaz `Refundable` permite añadir funcionalidad de reembolso de manera opcional.
La clase concreta `CreditCard` hereda la funcionalidad base de `PaymentMethod` y además implementa `Refundable`, demostrando cómo Kotlin permite mezclar herencia y contratos para modelar sistemas complejos de forma clara y modular.
*/

