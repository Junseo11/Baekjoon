package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var arr = Array(9){
        IntArray(9)
    }

    for(i in 0 .. 8){
        for(j in 0 .. 8){
            arr[i][j] = nextInt()
        }
    }


    var max = 0
    var maxR = 0
    var maxC = 0


    for(i in 0 .. 8){
        for(j in 0 .. 8){
            if(max<arr[i][j]){
                max = arr[i][j]
                maxR = i
                maxC= j
            }
        }
    }

    if(maxC==0 &&maxR == 0){
        maxR++
        maxC++
    }

    println(max)
    print("${maxR+1} ${maxC+1}")
}