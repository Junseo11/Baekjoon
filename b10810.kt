package baek.BaekjoonKotlin

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    val N = input.nextInt()
    val M =input.nextInt()

    val arr = mutableListOf<Int>()

    for(i in 0 until N){
        arr.add(0)
    }

    for(i in 0 until M){
        var a = input.nextInt()
        var b = input.nextInt()
        var c = input.nextInt()

        for(j in a-1 until b){
            arr[j] = c
        }
    }

    for(i in arr){
        print("$i ")
    }


}