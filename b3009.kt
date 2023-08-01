package baek.BaekjoonKotlin

import java.util.Scanner
//규칙은 찾았으나 구현x 모든 값들을 배열을통해 넣어보려고 함

//반복문 없이 조건문으로 해결 -> 너무 어렵게 생각했다

fun main() = with(Scanner(System.`in`)){

    var x1 = nextInt()
    var y1 = nextInt()
    var x2 = nextInt()
    var y2 = nextInt()
    var x3 = nextInt()
    var y3 = nextInt()

    var resx = 0
    var resy = 0

    if(x1 == x2){
        resx = x3
    }
    else if(x2 == x3){
        resx= x1
    }
    else{
        resx= x2
    }

    if(y1 == y2){
        resy = y3
    }
    else if(y2 == y3){
        resy= y1
    }
    else{
        resy= y2
    }

    println("${resx} ${resy}")




}