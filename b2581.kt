package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    var n = nextInt()
    var m = nextInt()

    var arr = mutableListOf<Int>()
    var res = 0



    for(i in n .. m){

        var sum = 0

        for(j in 1 ..m){
            if(i % j ==0){
                ++sum
            }
        }

        if(sum >2 || i == 1){
            continue
        }
        else{
            res+=i
            arr.add(i)

        }

    }

    arr.sort()

    if(arr.isEmpty()){
        println(-1)
    }
    else{
        println(res)
        println(arr[0])
    }

}