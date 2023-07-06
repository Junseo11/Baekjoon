package baek.BaekjoonKotlin

import java.util.Scanner

fun main()= with(Scanner(System.`in`)){

    var arr = arrayOf(1,1,2,2,2,8)

    var p = nextLine().split(" ")

    for(i in 0 until p.size){
        print("${arr[i]-p[i].toInt()} ")


    }


}