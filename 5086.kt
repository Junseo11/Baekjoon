package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){


    while (true){


        var a = nextInt()
        var b = nextInt()
        if(a == 0){
            break
        }

        if(b%a == 0){
            println("factor")
        }
        else if(a%b == 0){
            println("multiple")
        }
        else{
            println("neither")
        }
    }



}