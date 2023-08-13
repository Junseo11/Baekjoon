package baek.BaekjoonKotlin

import java.util.Scanner

//n 과 n의 각 자리의 합
//n까지 반복, 각 자리수+, 생성자가 가장 작은수 출력
// x 1부터 n까지 반복, 자신+자릿수 더한값이 n과 같으면 종료 x 출력

// 문자를 정수로 바꾸는 방법 틀림

fun main() = with(Scanner(System.`in`)){
    var n = nextInt()

    for(i in 0 .. n){
        if(jSum(i)+i == n){
            println(i)
            return@with
        }
    }
    println(0)
}

fun jSum(num : Int): Int{  //각 자리수 더하는 함수
    var sum = 0

    for(i in num.toString()){
        var cToi = i - '0'
        sum+= cToi
    }

    return sum
}
