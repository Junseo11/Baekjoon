package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    val n = nextInt()

    repeat(n){
        var x = nextInt()

        while (x>0){
            print("${x/25} ")
            x%=25

            print("${x/10} ")
            x%=10

            print("${x/5} ")
            x%=5

            print("${x/1} ")
            x%=1
        }

        println()
    }

}