package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    var a = nextInt()
    var b = nextInt()

    var arr = Array(a){
        IntArray(b)

    }

    for(i in 0 until a){
        for(j in 0 until b){
            arr[i][j] = nextInt()
        }
    }

    for(i in 0 until a){
        for(j in 0 until b){
            arr[i][j] +=nextInt()
        }
    }


    for(i in 0 until a){
        for(j in 0 until b){
            print("${arr[i][j]} ")
        }
        println()
    }

}