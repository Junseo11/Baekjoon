package baek.BaekjoonKotlin

import java.util.Scanner
/* n= 4일때 1 ~ n-1
1   2 3 4  3번
2   3 4  2번
3   4  1번
1부터 n까지의 합공식 n(n+1)/2
*
* */
fun main() = with(Scanner(System.`in`)){
    val input = nextLong()

    println((input-1)*((input-1)+1)/2)
    println(2)
}