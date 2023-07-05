package baek.BaekjoonKotlin

import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()){

    val n = readLine().toInt()

    for(i in 0 until n){
        var (x,y) = readLine().split(" ")

        for(q in 0 until y.length){
            for(z in 0 until x.toInt()){
                print(y[q])
            }
        }
        println()



    }

}