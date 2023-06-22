package baek.BaekjoonKotlin

import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    var n = input.nextInt()

    for(i in 1..n){
        for(j in n downTo 1){
            if(j>i){
                print(" ")
            }
            else{
                print("*")
            }
        }
        println()
    }

//    for(i in 1..n){
//        for(j in 1..n){
//            if(j<=n-i){
//                print(" ")
//            }
//            else{
//                print("*")
//            }
//
//        }
//        println()
//    }
//




}