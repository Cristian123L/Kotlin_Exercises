package collections

fun main(){
    //el setof es lista que no acepta duplicados
    val SUPPORTED = setOf("HTTP", "HTTPS","FTP")
    val requested = "HTTP"
    //Aqui solo se necesita saber si el elemento esta en la lista
    val isSupported: Boolean = requested in SUPPORTED
    println(isSupported)
}