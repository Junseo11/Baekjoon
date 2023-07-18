package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val destination = nextInt()

    var room = 1
    var res = 1

    if(destination == 1){
        println(1)
    }
    else{
        while (destination>room){
            room = room + (6 * res)
            ++res
        }

        println(res)
    }
}