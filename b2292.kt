package baek.BaekjoonKotlin

import java.util.Scanner


fun main() = with(Scanner(System.`in`)){
    val destination = nextInt()

    var nowRoom = 1
    var res = 1

    while(nowRoom<destination){
        nowRoom = nowRoom + (res*6)

        ++res
    }
    print(res)
}