package com.example.calculator

import java.util.Scanner

fun main() {
    sum()
}

fun sum(){
    val reader1 = Scanner(System.`in`)
    print("Enter the first number: ")

    var num1:Int = reader1.nextInt()

    val reader2 = Scanner(System.`in`)
    println("Enter the second number: ")

    var num2:Int = reader2.nextInt()

    println("$num1 + $num2 = " + (num1 + num2))
}