package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    val arr = arrayOf("c=","c-","dz=","d-","lj","nj","s=","z=")
    var str = next()

    arr.forEach {
        str = str.replace(it ,"z")
    }

    println(str.length)

}