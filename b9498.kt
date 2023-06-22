package baek.BaekjoonKotlin

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    var score = input.nextInt()

    var res=when{
        score>=90 ->'A'
        score>=80 ->'B'
        score>=70 ->'C'
        score>=60 ->'D'
        else -> 'F'
    }

    print(res)
}