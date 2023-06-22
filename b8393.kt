package baek.BaekjoonKotlin

import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    var n = input.nextInt()

    var sum= 0

    for(i in 0..n){
        sum+=i
    }

    print(sum)
}