package baek.BaekjoonKotlin

import java.util.*

fun main() = with(Scanner(System.`in`)){

    while (true){

        var ar = mutableListOf<Int>()
        var sum = 0
        var input = nextInt()

        if(input == -1){
            break
        }
        for(i in 1 ..input-1){
            if(input % i ==0){
                ar.add(i)
                sum+=i
            }
        }

        if(sum == input){
            print("${input} =")
            for(i in 0 until ar.size){
                if(i == ar.size-1){
                    print(" ${ar[i]}")
                }
                else{
                    print(" ${ar[i]} +")
                }
            }
            println()

        }
        else{
            println("${input} is NOT perfect.")
        }

    }


}