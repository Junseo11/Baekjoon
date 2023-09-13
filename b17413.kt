import java.lang.StringBuilder
import java.util.Scanner
import java.util.Stack

//< 시작인경우 pop   incheck true  > 종료인경우 incheck false
// true 인경우 그대로 출력
//false 인경우 공백인지 아니면
// 공백 시작인경우
// 일반 단어일경우 스택에 추가
val sb =StringBuilder()
val stack = Stack<Char>()
fun main() = with(Scanner(System.`in`)){
    val str = readLine().toString()


    var inout = false
    for(i in 0 until str.length){
        if(str[i] == '<'){
            inout = true
            recv()
            sb.append(str[i])
        }
        else if(str[i] == '>'){
            inout = false
            sb.append(str[i])
        }

        else if(inout == true){
            sb.append(str[i])
        }
        else if(inout == false){
            if(str[i] == ' '){
                recv()
                sb.append(" ")
            }
            else{
                stack.add(str[i])
            }
        }
    }

    recv()
    print(sb.toString())
}

fun recv(){
    while (stack.isNotEmpty()){
        sb.append(stack.pop())
    }
}