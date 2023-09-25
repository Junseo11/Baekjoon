package baek.BaekjoonKotlin

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.Scanner

fun main()= with(Scanner(System.`in`)){

    while (hasNextLine()){
        var str = nextLine()

        var a = 0
        var b = 0
        var c = 0
        var d = 0

        for(i in 0 until str.length){
            if(str[i].toInt()>=97 && str[i].toInt()<=122){
                ++a
            }
            else if(str[i].toInt()>= 65 && str[i].toInt()<=90){
                ++b
            }
            else if(str[i] == ' '){
                ++d
            }
            else{
                ++c
            }
        }

        println("${a} ${b} ${c} ${d}")
    }

}