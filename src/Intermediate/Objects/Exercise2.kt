package Intermediate.Objects
interface Vehicle {
    val name: String
    fun move(): String
}

object FlyingSkateboard : Vehicle {
    override val name = "Flying Skateboard"
    override fun move() = "Glides through the air with a hover engine"

    fun fly(): String = "Woooooooo"
}

fun main() {
    println("${FlyingSkateboard.name}: ${FlyingSkateboard.move()}")
    // Flying Skateboard: Glides through the air with a hover engine
    println("${FlyingSkateboard.name}: ${FlyingSkateboard.fly()}")
    // Flying Skateboard: Woooooooo
}

/*
Conclusión:
Este ejemplo muestra cómo se puede usar un **object singleton** en Kotlin para representar un vehículo único con comportamiento específico.
`FlyingSkateboard` implementa la interfaz `Vehicle`, lo que garantiza que tenga las propiedades y métodos esenciales (`name` y `move()`),
y además agrega su propio método `fly()`.
El uso de `object` asegura que solo exista una instancia de este vehículo, combinando la seguridad de un singleton con la flexibilidad de interfaces y métodos personalizados.
*/
