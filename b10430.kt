package baek

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    var a = input.nextInt()
    var b = input.nextInt()
    var c = input.nextInt()

    println((a+b)%c)
    println(((a%c)+(b%c))%c)
    println((a*b)%c)
    println(((a%c)*(b%c))%c)
}