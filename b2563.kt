package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()

    var sum = 0

    val arr = Array(100){
        BooleanArray(100){
            false
        }
    }

    repeat(n){
        var x = nextInt()
        var y = nextInt()

        for(i in x until x+10){
            for(j in y until y+10){

                if(arr[i][j]==true){
                    continue
                }
                arr[i][j]= true
                ++sum
            }
        }


    }

    println(sum)
}


