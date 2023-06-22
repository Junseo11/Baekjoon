package baek.BaekjoonKotlin

import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    var n = input.nextInt()

    var cnt = n/4

    var str = ""

    for(i in 0..cnt-1){

        str+="long "
    }

    str+= "int"

    print(str)
}