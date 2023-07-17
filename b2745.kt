package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.util.Scanner


fun main() = with(Scanner(System.`in`)){
    val n = next()
    val b = nextInt()


    var res = 0
    for(i in n.indices){
        if(n[i]>='0' && n[i]<='9'){
            res = res * b +(n[i]-'0')
        }
        else{
            res = res * b +(n[i]-'A'+10)
        }
    }

    println(res)
}