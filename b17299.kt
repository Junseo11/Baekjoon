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
    val stack = Stack<Int>()

    val n = br.readLine().toInt()
    val arr = IntArray(n)
    val countArray = IntArray(n)
    val res = IntArray(n)

    val st = br.readLine().split(" ")

    for(i in 0 until n){
        arr[i] = st[i].toInt()
        ++countArray[st[i].toInt()]
    }

    for(i in 0 until arr.size){
        while (stack.isNotEmpty() && countArray[arr[stack.peek()]] < countArray[arr[i]]){
            res[stack.pop()] = arr[i]
        }
        stack.push(i)
    }





    res.forEach {
        sb.append("${it} ")
    }

    bw.write(sb.toString().trim())
    bw.flush()
    bw.close()


}