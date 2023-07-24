package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    var input = nextInt()
    var res = input

    repeat(input){
        var q = nextInt()

        var sum =0
        for(i in 1 .. q){
            if(q % i ==0){
                ++sum
            }
        }
        if(sum>2 || q==1){
            --res
        }

    }

    print(res)

}