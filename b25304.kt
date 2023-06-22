package baek.BaekjoonKotlin

import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    var max = input.nextInt()
    var n = input.nextInt()

    var sum =0

    for(i in 0..n-1){
        var m = input.nextInt()
        var cnt = input.nextInt()

        var res = m*cnt

        sum += res
    }

    var res = if(sum == max){
        "Yes"
    }
    else{
        "No"
    }

    print(res)
}