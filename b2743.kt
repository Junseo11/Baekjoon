package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var str = next()
    var res=0
    for(i in 0..str.length-1){
        ++res
    }
    print(res)
}