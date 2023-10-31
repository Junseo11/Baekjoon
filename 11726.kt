import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    val arr = IntArray(1001)
    arr[1] = 1
    arr[2] = 2

    for(i in 0 until arr.size){
        arr[i] = (arr[i-1] + arr[i-2])%10007
    }

    println(arr[n])
}