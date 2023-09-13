import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()

    val arr = IntArray(n)
    val stack = Stack<Int>()
    var str = br.readLine().split(" ")
    for(i in 0 until arr.size){
        arr[i] = str[i].toInt()
    }

    for(i in 0 until arr.size){
        while (stack.isNotEmpty() && arr[stack.peek()] < arr[i]){
            arr[stack.pop()] = arr[i]
        }
        stack.push(i)
    }

    while (stack.isNotEmpty()){
        arr[stack.pop()] = -1
    }

    arr.forEach { it->
        sb.append("${it} ")
    }

    bw.write(sb.toString().trim())
    bw.flush()
    bw.close()
}