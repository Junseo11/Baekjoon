package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var n = next()
    var sb = StringBuilder()

    if(n == "0"){
        sb.append(0)
    }


    for(i in 0 until n.length){
        var a = n[i]-'0'

        if( a == 0){
            sb.append("000")
        }
        else{
            var sbin = StringBuilder()
            while (a>1){
                sbin.append((a%2).toString())
                a = a/2
            }
            sbin.insert(0,"1")
            sbin.reversed()

            if(sbin.length%3 == 1){
                sbin.insert(0,"00")
            }
            if(sbin.length%3 == 2){
                sbin.insert(0,"0")
            }
            sb.append(sbin)
        }



    }
    while (sb[0]=='0' && sb.length!=1){
        sb.deleteCharAt(0)
    }

    println(sb.toString())

}