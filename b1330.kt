package baek.BaekjoonKotlin

import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    var  a = input.nextInt()
    var  b = input.nextInt()

    var res = when{
        a>b -> '>'
        a<b -> '<'
        else -> "=="
    }
    print(res)
}