package baek.BaekjoonKotlin

import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    var  h = input.nextInt()
    var  m = input.nextInt()
    var pm = input.nextInt()

    m+=pm

    if(m>=60){

        var cnt = m/60
        m%=60

        h=h+cnt

    }

    if(h>=24){
        h-=24
    }

    print("$h $m")

}
