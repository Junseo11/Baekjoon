package baek.BaekjoonKotlin

import java.util.*

// 이중 반복문 -999 - 999까지

fun main() = with(Scanner(System.`in`)){
    var a = nextInt()
    var b = nextInt()
    var c = nextInt()
    var d = nextInt()
    var e = nextInt()
    var f = nextInt()

    for(x in -999 .. 999){
        for(y in -999 .. 999){
            if(a*x + b*y == c && d*x + e*y ==f){
                println("${x} ${y}")
                return@with
            }
        }
    }
}