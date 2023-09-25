package baek.BaekjoonKotlin

import java.util.Scanner

// 문자열 순회
// 대소문자라면 해당 글자에 +13 된 아스키 코드값 출력

fun main() = with(Scanner(System.`in`)){
    val str = nextLine()

    for(i in 0 until str.length){
        if(str[i].isDigit()){
            print(str[i])
        }
        else if(str[i] == ' '){
            print(' ')
        }
        else if (str[i].toInt() >= 65 && str[i].toInt()<=90){
            if(str[i].toInt()+13>90){
                print((64 + (str[i].toInt()+13-90)).toChar())
            }
            else{
                print((str[i].toInt()+13).toChar())
            }

        }
        else{
            if(str[i].toInt()+13>122){
                print((96 + (str[i].toInt()+13-122)).toChar())
            }
            else{
                print((str[i].toInt()+13).toChar())
            }

        }
    }
}