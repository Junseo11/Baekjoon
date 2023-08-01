package baek.BaekjoonKotlin

import java.util.Scanner

// 1일때 4 3개일때 바닥면 3 + 위면 1 + 옆면 바닥면*2 + 바닥 -1

// 입력이 10^9 일경우 long 형 사용

fun main() = with(Scanner(System.`in`)){

    var cnt = nextLong()

    var res = if(cnt == 1L){
        4
    }
    else{
        cnt * 4
    }

    println(res)
}