package baek.BaekjoonKotlin

import java.util.Scanner

//이중 반복문 한번에 n번이므로 n^3
//반복이 3번이므로 O(n^3)

fun main() = with(Scanner(System.`in`)){
    val n = nextLong()

    println(n*n*n)
    println(3)
}