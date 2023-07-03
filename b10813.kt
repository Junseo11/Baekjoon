package baek.BaekjoonKotlin

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    var n = input.nextInt()
    var m = input.nextInt()

    val arr = mutableListOf<Int>()

    for(i in 1 .. n){
        arr.add(i)
    }


    for(i in 0 until m){
        var a = input.nextInt()
        var b = input.nextInt()

        var temp = arr[a-1]
        arr[a-1] = arr[b-1]
        arr[b-1] = temp
    }

    for(i in arr){
        print("$i ")
    }
}

