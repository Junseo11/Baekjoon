package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.Scanner
import java.util.Stack

// index =1 입력값보다 index가 작을때까지 반복하며 현재 스택에 들어갈 index를 증가시킨다
// 스택의 마지막이 입력값과 같으면 -
// 아니면 no

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()

    val st = Stack<Int>()
    var index =1
    for(i in 0 until n){
        var s = br.readLine().toInt()

        while (index <= s){
            st.push(index)
            ++index
            sb.append("+\n")
        }

        if(st.last() == s){
            st.pop()
            sb.append("-\n")
        }
        else{
            println("NO")
            return
        }
    }

    println(sb.toString())
}