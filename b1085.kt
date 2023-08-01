package baek.BaekjoonKotlin

import java.awt.desktop.SystemEventListener
import java.lang.Integer.min
import java.util.Scanner
import kotlin.math.pow

fun main() = with(Scanner(System.`in`)){
    var a = nextInt()
    var b = nextInt()
    var c = nextInt()
    var d = nextInt()

    var dis1 = min(a,c-a)
    var dis2 = min(b,d-b)

    println(min(dis1,dis2))

}