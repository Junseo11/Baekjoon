package baek.BaekjoonKotlin

import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    var  a = input.nextInt()
    var  b = input.nextInt()

    if(a>0 &&b>0){
        print(1)
    }
    else if(a>0 && b <0){
        print(4)
    }
    else if(a<0 && b> 0 ){
        print(2)
    }
    else{
        print(3)
    }
}