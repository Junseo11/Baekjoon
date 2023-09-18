package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.*


fun main(){
    val br= BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val stack = Stack<Double>()
    val n = br.readLine().toInt()
    val str = br.readLine()
    val arr = DoubleArray(n){
        br.readLine().toDouble()
    }

    for(i in 0 until str.length){
        if(str[i].toInt()>=65 && str[i].toInt()<=90){
            stack.push(arr[str[i]-'A'])
        }
        else{
            var a = stack.pop()
            var b= stack.pop()

            var res = when(str[i]){
                '+' -> b+a
                '-' -> b-a
                '*' -> b*a
                '/' -> b/a
                else -> 0.0
            }

            stack.push(res)
        }
    }

    sb.append("%.2f".format(stack.pop()))
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}