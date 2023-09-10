package baek.BaekjoonKotlin

import java.util.Scanner
import java.util.Stack

fun main() = with(Scanner(System.`in`)){
    var str = next()

    val st = Stack<Char>()
    val st2 = Stack<Char>()
    for(i in 0 until str.length){
        st.push(str[i])
    }
    var n = nextInt()

    repeat(n){
        var order = next()

        when(order){
            "L" -> if(st.isNotEmpty()) st2.push(st.pop())
            "D" -> if(st2.isNotEmpty()) st.push(st2.pop())
            "B" -> if(st.isNotEmpty()) st.pop()
            "P" -> st.push(next()[0])
        }
    }

    print(st.toCharArray()+ st2.toCharArray().reversed())

}

