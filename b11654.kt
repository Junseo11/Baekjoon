package baek.BaekjoonKotlin

import java.util.Scanner


fun main(){

    val input = Scanner(System.`in`)

    var arr = IntArray(26){
        -1
    }

    var str = input.next()

    for(i in str.indices){
        if(arr[str[i].toInt()-97]==-1){
            arr[str[i].toInt()-97]=i
        }
    }

    arr.forEach {
        print("${it} ")
    }


}
