package baek.BaekjoonKotlin

import java.lang.Integer.max
import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    var n = input.nextInt()

    val arr = mutableListOf<Int>()

    for(i in 0..n-1){
        var a = input.nextInt()

        arr.add(a)
    }

    var max = arr[0]
    var min = arr[0]

    for(i in 1 .. n-1){
        if(max<arr[i]){
            max=arr[i]
        }
        if(min>arr[i]){
            min= arr[i]
        }
    }


    println("$min $max")

}