package baek.BaekjoonKotlin

import java.util.Scanner


fun main(){
    val input = Scanner(System.`in`)

    var year = input.nextInt()

    if(year%4 ==0){
        if(year%100 !=0){
            print(1)
        }
        else if(year %400 == 0){
            print(1)
        }
        else {
            print(0)
        }
    }
    else{
        print(0)
    }

}
