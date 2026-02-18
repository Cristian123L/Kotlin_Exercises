package Intermediate.Classes_and_interfaces

interface Media {
    val title: String
    fun play()
}

class Audio(override val title: String, val composer: String) : Media {
    override fun play() {
        println("Playing audio: $title, composed by $composer")
    }
}

fun main() {
    val audio = Audio("Symphony No. 5", "Beethoven")
    audio.play()
    // Playing audio: Symphony No. 5, composed by Beethoven
}

/*
Conclusión:
Este ejemplo ilustra cómo las interfaces en Kotlin permiten definir un contrato común
(`Media`) que puede ser implementado por diferentes tipos de medios.
La clase `Audio` implementa la interfaz, obligando a definir el método `play` y proporcionando
funcionalidad específica para reproducir audio. Esto demuestra cómo las interfaces facilitan
la abstracción y la flexibilidad, permitiendo trabajar con objetos de manera genérica mientras
cada clase concreta define su comportamiento particular.
*/

