package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    var a = nextInt()
    var b = nextInt()

    var c = nextInt()
    var n0 = nextInt()

    if((a * n0 + b <= c*n0) && (a<=c)){
        println(1)
    }
    else{
        println(0)
    }
}