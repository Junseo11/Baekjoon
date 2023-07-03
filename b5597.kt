package baek.BaekjoonKotlin

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    val arr = mutableListOf<Int>()

    for(i in 0 until 28){

        var a = input.nextInt()
        arr.add(a)
    }

    for(i in 1..30){
        if(i !in arr){
            println(i)
        }
    }







//    for(i in 0..31){
//        arr.add(0)
//    }
//
//    for(i in 1..28){
//        var a = input.nextInt()
//        arr[a] = 1
//    }
//
//    for(i in 1..30){
//        if(arr[i]!=1){
//            println(i)
//        }
//    }


}