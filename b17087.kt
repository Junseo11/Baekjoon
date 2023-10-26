import java.util.Scanner
import kotlin.math.abs

fun main() = with(Scanner(System.`in`)){
    var n = nextInt()
    var s = nextInt()

    val arr = LongArray(n){
        abs(s-nextLong())
    }

    var pre = arr[0]
    for(i in 0 until arr.size){
        pre = gcdg(arr[i], pre)
    }

    println(pre)
}

fun gcdg (a : Long, b: Long): Long{
    var a = a
    var b =b

    if(b>a){
        var temp = a
        a = b
        b = temp
    }

    while (b != 0L){
        var r = a % b
        a = b
        b = r
    }
    return a
}