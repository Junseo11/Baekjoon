package baek.BaekjoonKotlin

import java.lang.reflect.InaccessibleObjectException
import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    val str = next().uppercase()

    val arr = IntArray(26){
        0
    }

    for(i in 0 until str.length){
        var c = str[i] - 'A'
        arr[c]++
    }

    var max = 0
    var res = ' '

    for(i in 0 until arr.size){
        if(arr[i]>max){
            max = arr[i]
            res ='A'+i
        }
        else if(arr[i]==max){
            res ='?'
        }
    }

    print(res)



}

