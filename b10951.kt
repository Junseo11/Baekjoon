package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    var st :StringTokenizer

    while (true){
        st = StringTokenizer(br.readLine())

        var a = Integer.parseInt(st.nextToken())
        var b = Integer.parseInt(st.nextToken())

        if(a+b ==0){
            break
        }

        bw.write("${a+b}\n")

    }

    bw.flush()
    bw.close()
    br.close()


}