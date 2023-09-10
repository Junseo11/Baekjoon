package baek.BaekjoonKotlin

import java.lang.StringBuilder
import java.util.LinkedList
import java.util.Scanner


fun main() = with(Scanner(System.`in`)){
    val sb = StringBuilder()

    val n = nextInt()
    val deque = LinkedList<Int>()

    repeat(n){
        val order = next()

        when(order){
            "pop_front" -> if(deque.isEmpty()) sb.append("${-1}\n") else sb.append("${deque.pollFirst()}\n")
            "pop_back" -> if(deque.isEmpty()) sb.append("${-1}\n") else sb.append("${deque.pollLast()}\n")
            "size" -> sb.append("${deque.size}\n")
            "empty" -> if(deque.isEmpty()) sb.append("${1}\n") else sb.append("${0}\n")
            "front" -> if(deque.isEmpty()) sb.append("${-1}\n") else sb.append("${deque.first}\n")
            "back" -> if(deque.isEmpty()) sb.append("${-1}\n") else sb.append("${deque.last}\n")
            "push_front" -> deque.addFirst(nextInt())
            "push_back" -> deque.addLast(nextInt())
        }
    }

    print(sb.toString())
}