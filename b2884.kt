package baek.BaekjoonKotlin

import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    var  h = input.nextInt()
    var  m = input.nextInt()

    var resM = m -45

    if(resM<0){

        --h

        if(h<0){
            h+=24
        }

        resM+=60

        print("$h $resM")
    }

    else{
        if(h<0){
            h+=24
        }
        print("$h $resM")
    }


}