package baek.BaekjoonKotlin

import java.util.Scanner


//이중 배열 선언
//이중반복문으로 출력

//fun main() = with(Scanner(System.`in`)){
//
//    val n = nextInt()
//    val m = nextInt()
//
//    val arrA = Array(n){
//        IntArray(m){
//            nextInt()
//        }
//    }
//
//    val arrB = Array(n){
//        IntArray(m){
//            nextInt()
//        }
//    }
//
//    for(i in 0 until n){
//        for (j in 0 until m){
//            print("${arrA[i][j] + arrB[i][j]} ")
//        }
//        println()
//    }
//}
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