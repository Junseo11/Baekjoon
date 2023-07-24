package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    var n = nextInt()
    var k = nextInt()
    var arr = mutableListOf<Int>()

    for(i in 1 .. n){
        if(n% i == 0){
            arr.add(i)
        }
    }

    if(arr.size<k){
        println(0)
    }

    else{
        println(arr[k-1])
    }


}