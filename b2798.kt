package baek.BaekjoonKotlin

import java.util.Scanner
//문제 접근방식 틀림, 배열로 선언이후 3자리수 조합하는 방식 선택 오류

// 배열로 선언, 자리수 마다 반복문, m이내에 반복 m보다 작은 수중 가장 큰 수를 출력
//첫자리는 0부터 끝 -2, 둘째는 +1 부터 -1까지 셋째는 +2부터 끝까지 (이 부분 다시 생각)

fun main() = with(Scanner(System.`in`)){

    var n = nextInt()
    var m = nextInt()

    var arr = mutableListOf<Int>()

    repeat(n){
        arr.add(nextInt())
    }
    var max = 0

    for(i in 0 until arr.size-2){
        for(j in i+1 until arr.size-1){
            for(k in j+1 until arr.size){
                var res = arr[i] + arr[j] + arr[k]
                if(max<res && res <= m){
                    max = res
                }
            }
        }
    }

    println(max)

}