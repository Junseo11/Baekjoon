package baek.BaekjoonKotlin

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    //각 라인의 최댓값을 구한다
    //짝수일때 자식은 전체값 -

    //해결안됨

    var input = nextInt()
    var temp = 0
    var index = 0

    while (input>temp){
        ++index
        temp = index + temp
    }

    if(index%2 == 0){
        var child = index - input + 1
        var parent = temp - child

        print("${child}/${parent}")
    }
    else{
        var parent = index - input + 1
        var child = index - parent

        print("${child}/${parent}")


    }





}
