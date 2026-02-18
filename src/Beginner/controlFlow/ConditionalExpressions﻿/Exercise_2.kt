package Beginner.controlFlow.`ConditionalExpressions﻿`

fun main(){
    val button = "f"
    val Action = when(button){
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There's no such button"
    }
    println(Action)

}