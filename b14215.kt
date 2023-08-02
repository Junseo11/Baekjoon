package baek.BaekjoonKotlin

import java.util.Scanner

// 삼각형을 만들수 있는경우를 먼저

fun main() = with(Scanner(System.`in`)){

    val arr = mutableListOf<Int>()

    repeat(3){
        arr.add(nextInt())
    }

    arr.sort()

    if(arr[0]+arr[1]>arr[2]){
        println(arr[0]+arr[1]+arr[2])
    }
    else{
        println(arr[0]+arr[1]+(arr[0]+arr[1])-1)
    }

}
