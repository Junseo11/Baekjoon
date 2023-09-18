package baek.BaekjoonKotlin

import java.lang.StringBuilder
import java.util.*

fun main() = with(Scanner(System.`in`)){
    var str = next()
    val stack = Stack<Char>()
    val sb = StringBuilder()
    for (i in 0 until str.length){
        if(str[i].toInt() >= 65 && str[i].toInt()<=90){
            sb.append(str[i])
        }
        else if(str[i] == '('){
            stack.push(str[i])
        }
        else if(str[i] == ')'){
            while (stack.isNotEmpty() && stack.peek() !='('){
                sb.append(stack.pop())
            }
            stack.pop()
        }
        else{
            if(str[i] == '+' || str[i] == '-'){
                while (stack.isNotEmpty() && stack.peek()!='('){
                    sb.append(stack.pop())
                }
            }
            else{
                while (stack.isNotEmpty()&& stack.peek() != '+' && stack.peek()!= '-' &&stack.peek() != '('){
                    sb.append(stack.pop())
                }
            }

            stack.push(str[i])
        }
    }

    while (stack.isNotEmpty()){
        sb.append(stack.pop())
    }

    print(sb.toString())

}