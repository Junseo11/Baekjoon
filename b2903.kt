package baek.BaekjoonKotlin

import java.util.Scanner

fun main()= with(Scanner(System.`in`)){
    val n = nextInt()

    var res = 2
    var q = 1

    for(i in 0 until n){
        res = res + (res-1)
    }
    print(res*res)

}