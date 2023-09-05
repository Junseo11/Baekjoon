package baek.BaekjoonKotlin

import java.util.Scanner
import java.util.Stack


fun main() = with(Scanner(System.`in`)){
    val n = nextInt()

    repeat(n){
        var str = next()
        var res = "YES"
        val st = Stack<Char>()
        for(i in str){
            if(i =='('){
                st.push(i)
            }

            else if(i ==')'){
                if(st.isEmpty()){
                    res = "NO"
                    break
                }
                if(st.pop() == ')'){
                    res = "NO"
                    break
                }
            }
        }
        if(!st.isEmpty()){
            res = "NO"
        }
        println(res)
    }
}