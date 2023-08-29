package baek.BaekjoonKotlin

import java.util.*


// a 누르려면 +3
//문자 배열 만든다 문자열 자리수 반복
// 배열 순회하면서 배열인덱스 안에 문자가 있다면 j 출력
//
//fun main() = with(Scanner(System.`in`)){
//    val str = next()
//    val arr = arrayOf("ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ")
//
//    var res = 0
//    for(i in str){
//        for(j in 0 until arr.size){
//            if(arr[j].contains(i)){
//                res+= (j+3)
//            }
//        }
//    }
//
//    println(res)


    fun main() = with(System.`in`.bufferedReader()){

    val str = readLine()

    val arr = arrayOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")

    var res = 0

    for(i in str.indices){
        for(j in arr){
            if(j.contains(str[i])){
                res+=arr.indexOf(j)+3
            }
        }
    }

    print(res)
}