package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    val str = next()

    var res = if(str == str.reversed()){
         1
    }
    else {
        0
    }

    print(res)
}