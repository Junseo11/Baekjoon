import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val (a,b) = br.readLine().split(" ").map { it.toInt() }
    val arr = BooleanArray(b+1){true}
    val sqb = Math.sqrt(b.toDouble()).toInt()

    for(i in 2..sqb){
        var j = 2

        while (i*j <= b){
            if(arr[i*j]){
                arr[i*j] = false
            }

            ++j
        }
    }

    for(i in a..b){
        if(arr[i]){
            if(i == 1){
                continue
            }
            sb.append("${i}\n")
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}