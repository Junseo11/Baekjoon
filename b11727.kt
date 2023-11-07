import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    val arr = IntArray(1001)  //

    arr[0] = 0
    arr [1] = 1
    arr[2] = 3

    for(i in 3 until arr.size){
        arr[i] = (arr[i-1] + 2*arr[i-2])%10007
    }

    println(arr[n])
}