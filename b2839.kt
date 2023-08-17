package baek.BaekjoonKotlin

import java.util.Scanner

//n을 5,3으로 나눈다, 반복 둘다 안되는 경우 -1 출력

//반복문 계속될때 -3 5의 배수일때까지

fun main() = with(Scanner(System.`in`)){
    var n = nextInt()
    var res = 0

    while (true){
        if(n%5 ==0){
            println("${res+ n/5}")
            break
        }
        else if(n<0){
            println(-1)
            break
        }

        n -=3
        res++
    }

}