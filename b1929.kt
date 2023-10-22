package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.Scanner


//에라토스네스의 체로 다시 풀기

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a,b) = br.readLine().split(" ").map { it.toInt() }

    for(i in a .. b){
        var cnt = 0
        for(j in 2 .. i){
            if(i%j == 0){
                ++cnt
            }
        }

        if(cnt == 1){
            sb.append("${i}\n")
        }
    }
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}