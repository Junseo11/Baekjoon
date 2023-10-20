package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.io.InputStreamReader


fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a,b,c,d) = br.readLine().split(" ")

    var suma = (a+b).toLong()
    var sumb = (c+d).toLong()

    print("${suma+sumb}")


}