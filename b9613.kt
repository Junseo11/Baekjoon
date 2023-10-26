import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var n = nextInt()

    repeat(n){
        var a = nextInt()

        val arr = LongArray(a){nextLong()}

        var cnt = 0L
        for(i in 0 until arr.size-1){
            for(j in i+1 until arr.size){
                cnt += gcd(arr[i],arr[j])
            }
        }

        println(cnt)
    }
}

fun gcd(a: Long, b: Long) : Long{
    var a = a
    var b = b

    if(b>a){
        var temp = a
        a= b
        b= temp
    }

    while (b!=0L){
        var r = a%b
        a = b
        b = r
    }
    return a
}