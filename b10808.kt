package baek.BaekjoonKotlin

import java.lang.StringBuilder
import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val arr = IntArray(26){
        0
    }
    val sb = StringBuilder()
    val str = next()

    for(i in 0 until str.length){
        ++arr[str[i]-'a']
    }

    arr.forEach { it->
        sb.append("${it} ")
    }
    print(sb.toString().trim())
}