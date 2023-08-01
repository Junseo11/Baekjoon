package baek.BaekjoonKotlin

import java.util.Scanner
//1,2일때는 0 출력 x 가장 작은곳 왼쪽아래 변 가장 큰것 오른쪽 변 y 가장 큰거 위변 작은거 아래 면
//배열로 받아서 홀수 x 짝수 y 최대최소 파악
// 점이 2개일 경우도 생각(오류)

fun main() = with(Scanner(System.`in`)){

    var xarr = mutableListOf<Int>()
    var yarr = mutableListOf<Int>()

    var n = nextInt()



    if(n>1){

        repeat(n){
            xarr.add(nextInt())
            yarr.add(nextInt())
        }

        var xmax = -100000
        var xmin = 100000
        var ymax = -100000
        var ymin = 100000

        for(i in 0 until xarr.size){
            if(xarr[i]>xmax){
                xmax = xarr[i]
            }

            if(xarr[i]<xmin){
                xmin = xarr[i]
            }
        }

        for(i in 0 until yarr.size){
            if(yarr[i]>ymax){
                ymax = yarr[i]
            }

            if(yarr[i]<ymin){
                ymin = yarr[i]
            }
        }

        println((xmax - xmin)*(ymax - ymin))
    }
    else{
        println(0)
    }

}