package collections

fun main() {
    //Aqui se aprende  a usasr el listof en este caso
    //solo es una lista de read-only
    val greenNumbers = listOf(1,4,23)
    val redNumbers = listOf(17,2)
    //solo se desea saber el total de elementos que hay
    println("Total size ${greenNumbers.count() + redNumbers.count()}")
}