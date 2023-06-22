package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st : StringTokenizer

    var n = Integer.parseInt(br.readLine())
    var sum = 0

    for(i in 0..n-1){
        st = StringTokenizer(br.readLine())

        var a = Integer.parseInt(st.nextToken())
        var b = Integer.parseInt(st.nextToken())

        sum = a+b

        bw.write("$sum\n")

    }

    bw.flush()
    bw.close()
    br.close()
}