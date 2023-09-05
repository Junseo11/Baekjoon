package baek.BaekjoonKotlin

import java.util.*
//한수는 각자리수가 등차수열이룰때
// 99 까지는 무조건 한수
// 100부터는 각 자리 순회하면서 두자리수의 차가 같다면 한수


fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    var res = 0

    if(n <= 99){
        res = n
    }
    else{
        res+= 99

        for(i in 100 until n){
            var str = i.toString()
            var isTrue = true
            var same = str[0]-str[1]
            for(j in 0 until str.length) {
                if (j + 1 < str.length) {
                    if(str[j] - str[j + 1] == same){
                        continue
                    }
                    else{
                        isTrue = false
                    }
                }

            }
            if(isTrue){
                ++res
            }
        }
    }

    println(res)

}
