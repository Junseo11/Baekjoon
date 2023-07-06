package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.io.InputStream
import java.util.*

fun main() = with(System.`in`.bufferedReader()){

    var str = readLine().trim().split(" ")

    var res =0

    for(i in 0 until str.size){
        if(str[0].isNotEmpty()){
            ++res
        }
    }

    print(res)
}