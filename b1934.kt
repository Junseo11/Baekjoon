package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var n = nextInt()

    repeat(n){
        var a = nextInt()
        var b = nextInt()

        if(b>a){
            var tmp = a
            a = b
            b = tmp
        }

        var c = a*b

        while (b!=0){
            var r = a%b
            a = b
            b = r
        }

        println(c/a)

    }

}