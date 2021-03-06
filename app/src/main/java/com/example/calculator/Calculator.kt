package com.example.calculator

import java.util.Scanner

fun main() {
    println("Wanna calc something real quick?\n" +
            " Use 1 for addition;\n" +
            " 2 for subtraction;\n" +
            " 3 for multiplication\n" +
            " And 4 for division" +
            "")

    var input = readLine()

    when(input) {
        "1" -> calc("+")
        "2" -> calc("-")
        "3" -> calc("*")
        "4" -> calc("/")
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

fun calc(operator:String){
    val reader1 = Scanner(System.`in`)
    print("Enter the first number: ")

    var num1:Int = reader1.nextInt()

    val reader2 = Scanner(System.`in`)
    print("Enter the second number: ")

    var num2:Int = reader2.nextInt()

    val result:Double = when(operator){
        "+" -> (num1 + num2).toDouble()
        "-" -> (num1 - num2).toDouble()
        "*" -> (num1 * num2).toDouble()
        "/" -> (num1 / num2).toDouble()
        else -> 0.0
    }

    println("$num1 $operator $num2 = " + result)
}