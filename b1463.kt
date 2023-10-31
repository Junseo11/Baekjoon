import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()

    val arr = IntArray(n+1)
    arr[0] = 0
    arr[1] = 0

    for(i in 2 until arr.size){
        arr[i] = arr[i-1] +1
        if(i%2 ==0) arr[i] = Math.min(arr[i], arr[i/2]+1)
        if(i%3 ==0) arr[i] = Math.min(arr[i], arr[i/3]+1)
    }

    println(arr[n])
}