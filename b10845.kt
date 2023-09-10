package baek.BaekjoonKotlin

import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    val q :Queue<Int> = LinkedList<Int>()
    val sb = StringBuilder()
    repeat(n){
        var order = next()
        when(order){
            "pop" -> if(q.isNotEmpty()) sb.append("${q.poll()}\n") else sb.append("${-1}\n")
            "size" -> sb.append("${q.size}\n")
            "empty" -> if(q.isEmpty()) sb.append("${1}\n") else sb.append("${0}\n")
            "front" -> if(q.isEmpty()) sb.append("${-1}\n") else sb.append("${q.first()}\n")
            "back" -> if(q.isEmpty()) sb.append("${-1}\n") else sb.append("${q.last()}\n")
            "push" -> q.add(nextInt())
        }
    }

    println(sb.toString())
}
