package baek.BaekjoonKotlin

import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    var  n = input.nextInt()

    for(i in 1..9){
        println("$n * ${i} = ${n*i}")
    }
}
