package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    val n = nextInt()

    var res = n

    repeat(n){
        var str = next()
        var set = mutableSetOf<Char>()
        var last =' '
        var isGroup = true

        str.forEach {
            if(last!=it){
                last= it

                if(!set.add(it)) isGroup = false
            }
        }

        if(isGroup == false){
            --res
        }
    }

    print(res)


}