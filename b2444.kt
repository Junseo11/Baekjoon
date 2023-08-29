package baek.BaekjoonKotlin
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//공백 증가 1 부터 n-i까지
//별 증가 1부터 1+2*i
//공백증가 1부터 i까지
//별감소 1부터 n-(i+1)*2-1

fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    for(i in 1..n){
        for(j in 1..n-i){
            print(" ")
        }
        for(j in 1..1+(i-1)*2){
            print("*")
        }
        println()
    }

    for(i in 1..n-1){
        for(j in 1..i){
            print(" ")
        }
        for(j in 1..(n-i)*2-1){
            print("*")
        }
        println()
    }


}



//
//import java.util.Scanner
//
//fun main() = with(Scanner(System.`in`)){
//
//    val n = nextInt()
//
//    for(i in 1 .. n){
//        for(j in 1 ..n-i) print(" ")
//        for(j in 1..(i-1)*2+1) print("*")
//
//        println()
//    }
//
//    for(i in (n-1)downTo 1){
//        for(j in 1..n-i) print(" ")
//        for(j in 1..(i-1)*2+1) print("*")
//
//        println()
//    }
//}

