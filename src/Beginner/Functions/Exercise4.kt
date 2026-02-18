package Beginner.Functions

fun main() {

    val actions = listOf("title", "year", "author")
    // val: variable inmutable (no cambia)
    // listOf(): crea una lista
    // actions es una lista de Strings
    val prefix = "https://example.com/book-info"
    // String que representa la base de la URL
    val id = 5
    // variable entera (identificador del libro)
    val urls = actions.map { action -> "$prefix/$id/$action" }
    // map: función que transforma cada elemento de la lista
    // { action -> ... } es una lambda (función anónima)
    // action representa cada elemento de la lista
    // "$prefix/$id/$action" es interpolación de Strings
    // Se crea una nueva lista con las URLs generadas
    println(urls)
    // imprime la nueva lista con todas las URLs
}
