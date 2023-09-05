package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

// 인덱스의 가장 뒤부터 출력

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val stack = Stack<Char>()

    repeat(n){
        var str = br.readLine()

        for(i in 0 until str.toCharArray().size){
            if(str[i] == ' '){
                while (!stack.isEmpty()){
                    print(stack.pop())
                }
            }
        }
        println()
    }
}