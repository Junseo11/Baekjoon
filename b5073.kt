package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){


    while (true){
        val arr = mutableListOf<Int>()

        arr.add(nextInt())
        arr.add(nextInt())
        arr.add(nextInt())

        if(arr[0] == 0 && arr[1] == 0 && arr[2] ==0){
            break
        }

        arr.sort()

        if(arr[2] >= arr[0]+arr[1]){
            println("Invalid")
        }
        else if(arr[0] == arr[2]){
            println("Equilateral")
        }
        else if(arr[0] == arr[1] || arr[1] == arr[2] ||arr[2] == arr[0]){
            println("Isosceles ")
        }
        else{
            println("Scalene ")
        }


    }
}