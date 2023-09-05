package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner

lateinit var arr :IntArray
var index = -1

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    arr = IntArray(n)


    repeat(n){
        var order = br.readLine()
        when(order.split(" ")[0]){
            "pop" -> pop()
            "size" -> size()
            "empty" -> empty()
            "top" -> top()
            "push" -> push(order.split(" ")[1].toInt())

        }
    }
}

fun pop(){
    if(index == -1){
        println(-1)
    }
    else{
        println(arr[index--])
    }

}
fun size(){
    println(index+1)

}
fun empty(){
    if(index == -1){
        println(1)
    }
    else{
        println(0)
    }

}
fun top(){
    if(index == -1){
        println(-1)
    }
    else{
        println(arr[index])
    }

}
fun push(x:Int){
    ++index
    arr[index] = x

}