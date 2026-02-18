package Beginner.Classes

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
// Persona con nombre, dirección y si tiene mascota (default = true)

data class Name(val first: String, val last: String)
// Nombre con primer y último nombre

data class Address(val street: String, val city: City)
// Dirección con calle y ciudad

data class City(val name: String, val countryCode: String)
// Ciudad con nombre y código de país

fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
    // Crea un objeto Person con datos completos
}

