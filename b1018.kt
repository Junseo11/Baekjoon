package baek.BaekjoonKotlin

import java.lang.Integer.min
import java.util.Scanner

// 8<= n,m <= 50
// 문자 이중배열, 행부터 한칸씩 옆으로 가면서 w b 가 반복인지 학인 아니면 res +1
// res가 가장큰 부분 출력

//8*8원본 배열 생성
//원본 배열, 지금 배열 비교, 더 작은값 출력

fun main() = with(Scanner(System.`in`)){
    val n = nextInt() // 가로
    val m = nextInt() //세로
    var curX = 0 //열
    var curY = 0 //행
    var cw = 0
    var cb = 0
    var min = 1000000

    val arr = Array(n){
        CharArray(m)
    }

    val white = arrayOf(
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW"
    )
    val black = arrayOf(
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB"
    )

    nextLine() // 전에 있던 입력 모두 호출 -> 제거
    for(i in 0 until n){
        var tmp = nextLine()
        for(j in 0 until m){
            arr[i][j] = tmp[j]
        }
    }

    while (true){
        if(curX+8>n && curY>m){
            break
        }
        var x = 0
        var y = 0
        if(curX+8 <= m){
            if(curY+8 <=n){
                for(i in curY until curY+8){
                    for(j in curX until curX+8){
                        if(white[x][y]!=arr[i][j]){
                            ++cw
                        }
                        if(black[x][y]!=arr[i][j]){
                            ++cb
                        }
                        ++y
                    }
                    ++x
                    y = 0
                }
                var result = min(cb,cw)
                min = min(min,result)
                cw = 0
                cb = 0
                curX++
            }
            else{
                break
            }
        }
        else{
            curX = 0
            curY ++
        }
    }
    println(min)
}