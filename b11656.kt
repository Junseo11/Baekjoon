package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    var str = next()

    // 문자열 길이만큼 배열
    // 반복문으로 한글자씩 제거

    var arr = Array(str.length){
        str
    }

    for(i in 0 until str.length){
        arr[i] = arr[i].substring(i,arr[i].length)
    }

    arr.sort()

    arr.forEach {
        println(it)
    }


}