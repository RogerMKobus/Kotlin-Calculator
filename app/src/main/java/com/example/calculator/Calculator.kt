package com.example.calculator

import java.util.Scanner
import kotlin.math.sqrt

fun main() {

    println("Wanna calc something real quick?\n" +
            " Use 1 for addition;\n" +
            " 2 for subtraction;\n" +
            " 3 for multiplication\n" +
            " 4 for division\n" +
            " and 5 for Quadratic Formula")

    var input = readLine()

    when(input) {
        "1" -> calc("+")
        "2" -> calc("-")
        "3" -> calc("*")
        "4" -> calc("/")
        "5" -> quadraticFormula()
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
    val reader = Scanner(System.`in`)

    print("Enter the first number: ")
    var num1:Int = reader.nextInt()

    print("Enter the second number: ")
    var num2:Int = reader.nextInt()

    val result:Double = when(operator){
        "+" -> (num1 + num2).toDouble()
        "-" -> (num1 - num2).toDouble()
        "*" -> (num1 * num2).toDouble()
        "/" -> (num1 / num2).toDouble()
        else -> 0.0
    }

    println("$num1 $operator $num2 = " + result)
}

fun quadraticFormula(){
    val reader = Scanner(System.`in`)

    print("Enter the value of a: ")
    var a:Int = reader.nextInt()
    print("Enter the value of b: ")
    var b:Int = reader.nextInt()
    print("Enter the value of c: ")
    var c:Int = reader.nextInt()

    println("x1 = " + ((-b + sqrt((b * b -4 * a * c).toDouble())) /2 * a ))
    println("x2 = " + ((-b - sqrt((b * b -4 * a * c).toDouble())) /2 * a ))
}