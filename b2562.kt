package baek.BaekjoonKotlin

import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    val arr= mutableListOf<Int>()

    var max = 0
    var maxI=0

    for(i in 0 until 9){
        var a = input.nextInt()

        arr.add(a)

        if(max<arr[i]){
            max= arr[i]
            maxI = i+1
        }
    }

    print("$max\n$maxI")


}