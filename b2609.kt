import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var a = nextInt()
    var b = nextInt()
    var c = a*b

    if(b>a) {
        var tmp = a
        a = b
        b = tmp
    }

    while (b!=0){
        var r = a%b
        a = b
        b = r
    }

    println(a)
    println(c/a)
}