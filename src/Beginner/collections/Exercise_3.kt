package Beginner.collections

fun main(){
    //Este es un mapa igual solo de read-only
    //la clave es este caso el tipo String y el dato asociado es el numero
    val number2word = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    val n = "two"
    //Solo se quiere saber que dato gurda la llave n
    println("$n is spelt as '${number2word[n]}'")

}