package baek.BaekjoonKotlin

import kotlin.math.round

fun main() = with(System.`in`.bufferedReader()){

    var sp = 0.0
    var sum= 0.0


    for(i in 0 until 20){

        var str = readLine()

        var (name, score, score2) = str.split(" ")

        if(score2=="P"){
            continue
        }
        var s = when(score2){
            "A+" ->4.5f
            "A0" ->4.0f
            "B+" ->3.5f
            "B0" ->3.0f
            "C+" ->2.5f
            "C0" ->2.0f
            "D+" ->1.5f
            "D0" ->1.0f
            "F" ->0.0f
            else -> 0f
        }

        var sco : Double = score.toDouble()

        sp += sco*s
        sum+=sco


    }

    println(sp/sum)

}