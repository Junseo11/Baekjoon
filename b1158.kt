package baek.BaekjoonKotlin

import java.lang.StringBuilder
import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

//큐의 3번째를 pop sb에 추가
//큐가 3보다 작으면 3 - 큐의 사이즈 만큼 증가하면서 다시 큐의 처음르로 큐가 빌때까지 반복
//큐가 빌때까지 반복 fron를 m만큼 pop, push
//젤 앞을 pop 출력

fun main() = with(Scanner(System.`in`)){
    val queue: Queue<Int> = LinkedList<Int>()
    var sb = StringBuilder()

    val n = nextInt()
    val m = nextInt()

    for(i in 0 until n){
        queue.add(i+1)
    }

    sb.append('<')
    while (queue.isNotEmpty()){
        for(i in 0 until m-1){
            val front = queue.first()
            queue.poll()
            queue.add(front)
        }
        sb.append(queue.poll())
        if(queue.isNotEmpty()){
            sb.append(", ")
        }
    }
    sb.append('>')
    print(sb.toString())
}