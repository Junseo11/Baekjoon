package baek.BaekjoonKotlin

import java.util.Scanner

fun main()= with(Scanner(System.`in`)){

    val a = nextInt()
    val b= nextInt()
    val v = nextInt()

    var day = (v-b)/ (a-b)  //최소한의 날을 계산한다 

    if((v-b)%(a-b)!=0){ // 나머지가 있으면 추가한다 
        ++day
    }

    println(day)


}