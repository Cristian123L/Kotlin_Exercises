package Intermediate.ExtensionFunctions

// Esta es una función de extensión para la clase String
// 'fun String.toLowercaseString()' significa que estamos agregando una función llamada 'toLowercaseString' a todos los Strings
// 'this' dentro de la función hace referencia al String que llama a la función
fun String.toLowercaseString(): String = this.lowercase()
// La función usa 'lowercase()' (método estándar de Kotlin) para convertir todo el texto a minúsculas
// Devuelve el String resultante

// Función main: punto de entrada del programa
fun main() {
    // Llamamos a la función de extensión 'toLowercaseString' sobre el String "Hello World!"
    println("Hello World!".toLowercaseString())
    // Imprime 'hello world!' porque la función convierte todas las letras a minúsculas
}

