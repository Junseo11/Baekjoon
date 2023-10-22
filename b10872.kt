package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    println(factorial(n))
}

fun factorial(n:Int):Int{
    if(n == 0){
        return 1
    }
    else{
        return n * factorial(n-1)
    }
}