package baek.BaekjoonKotlin

import java.lang.StringBuilder
import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    var n = nextInt()
    var b = nextInt()

    val sb = StringBuilder()

    while(n>0){
        if(n%b<10){
            sb.append((n%b +'0'.toInt()).toChar())
        }
        else{
            sb.append((n%b-10+'A'.toInt()).toChar())
        }

        n = n/b
    }

    println(sb.reversed())
}