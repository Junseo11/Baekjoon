package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(System.`in`.bufferedReader()){
    var (n,m) = readLine().split(" ").map {
        it.toInt()
    }


    val arr = IntArray(n + 1) {
        it
    }

    repeat(m){
        var(i,j) = readLine().split(" ").map{
            it.toInt()
        }

        while (i<j){
            var temp = arr[i]
            arr[i++] = arr[j]
            arr[j--]=temp
        }
    }

    for(i in 1..arr.size-1){
        print("${arr[i]} ")
    }

}








//fun main() = with(System.`in`.bufferedReader()) {
//    val (N, M) = readLine().split(" ").map {
//        it.toInt()
//    }
//    val arr = IntArray(N + 1) {
//        it
//    }
//    repeat(M) {
//        var (i, j) = readLine().split(" ").map {
//            it.toInt()
//        }
//        while(i < j) {
//            val v = arr[i]
//            arr[i++] = arr[j]
//            arr[j--] = v
//        }
//    }
//
//    for(i in 1..arr.size-1){
//        print("${arr[i]} ")
//    }
//}




