package com.example.calculator

import java.util.Scanner

fun main() {
    println("Wanna calc something real quick?\n Use 1 for addition;\n" +
            " 2 for subtraction;\n And 3 for multiplication")

    var input = readLine()

    when(input) {
        "1" -> addition()
        "2" -> subtraction()
        "3" -> multiplication()
        else -> {println("Enter a function number!")
            main()
        }
    }

    println("Something else? \n" +
            " Type 1 for Yes\n" +
            " Or anything else for No")

    var repeat = readLine()

    if(repeat == "1"){
        main()
    }
}

fun addition (){
    val reader1 = Scanner(System.`in`)
    print("Enter the first number: ")

    var num1:Int = reader1.nextInt()

    val reader2 = Scanner(System.`in`)
    print("Enter the second number: ")

    var num2:Int = reader2.nextInt()

    println("$num1 + $num2 = " + (num1 + num2))
}

fun subtraction(){
    val reader1 = Scanner(System.`in`)
    print("Enter the first number: ")

    var num1:Int = reader1.nextInt()

    val reader2 = Scanner(System.`in`)
    print("Enter the second number: ")

    var num2:Int = reader2.nextInt()

    println("$num1 - $num2 = " + (num1 - num2))
}

fun multiplication (){
    val reader1 = Scanner(System.`in`)
    print("Enter the first number: ")

    var num1:Int = reader1.nextInt()

    val reader2 = Scanner(System.`in`)
    print("Enter the second number: ")

    var num2:Int = reader2.nextInt()

    println("$num1 * $num2 = " + (num1 * num2))
}