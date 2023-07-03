package baek.BaekjoonKotlin

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    var n = input.nextInt()

    val arr = mutableListOf<Int>()
    var sum = 0

    for(i in 0..n-1){
        var a = input.nextInt()
        arr.add(a)
    }

    var res = input.nextInt()


    for(i in arr){

        if(res == i){
            ++sum
        }

    }

    println(sum)

}