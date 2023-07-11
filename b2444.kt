package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    val n = nextInt()

    for(i in 1 .. n){
        for(j in 1 ..n-i) print(" ")
        for(j in 1..(i-1)*2+1) print("*")

        println()
    }

    for(i in (n-1)downTo 1){
        for(j in 1..n-i) print(" ")
        for(j in 1..(i-1)*2+1) print("*")

        println()
    }
}

