package baek.BaekjoonKotlin

import java.util.*

//( 다음이 ) 이라면 레이저이다 stack의 res에 stack 사이즈 더한다
//( 다음이 ) 가 아니라면 stack에 add
// ) 가 나왔다면 스택에서 pop

fun main() = with(Scanner(System.`in`)){
    var str = next()
    val stack = Stack<Char>()
    var i = 0
    var res = 0
    while (i < str.length){
        if(str[i] == '(' && i+1 <= str.length){
            if(str[i+1] == ')'){
               res += stack.size
                ++i
            }
            else{
                stack.add(str[i])
            }
        }
        else{
            stack.pop()
            ++res
        }
        ++i
    }
    print(res)
}
