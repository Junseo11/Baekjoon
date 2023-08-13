package baek.BaekjoonKotlin

import java.util.Scanner

//알고리즘 7 *7 번수행 O(n^2)이므로 차수 2
//print할때 500000까지인데 제곱으로 25000000이므로 int 범위 넘어간다 -> long

fun main() = with(Scanner(System.`in`)){
    var input = nextLong()

    println(input*input)
    println(2)
}