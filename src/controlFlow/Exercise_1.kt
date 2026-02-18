package controlFlow

import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    // Write your code here
    if(firstResult == secondResult){
        println("You win :)")
    }
    else{
        println("You lose:(")
    }

}