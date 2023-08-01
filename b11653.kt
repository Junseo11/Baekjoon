package baek.BaekjoonKotlin

import java.util.*

fun main() = with(Scanner(System.`in`)){
    var input = nextInt()

    var index = 2

    while(input >1){
        if(input%index ==0){
            input /= index
            println(index)
        }

        else{
            ++index
        }
    }
}



