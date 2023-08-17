package baek.BaekjoonKotlin

import java.util.Scanner

// 1이면 666
//666이 연속으로 있는수 차례로
//작은수부터 666비교 수안에 666이 있으면 res+1 n과 같으면 출력

//문제이해 오류, for문 사용해서 i의 값을 10000으로 제한해버린 오류

fun main() = with(Scanner(System.`in`)){
    var n = nextInt()
    var str = "666"
    var res = 0
    var i =0

    while (true){
        ++i
        if(i.toString().contains(str)){
            ++res
        }
        if(res == n){
            println(i)
            return@with
        }
    }
}