import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val sb = StringBuilder()
    val arr = BooleanArray(1000001){true}

    for(i in 2 until arr.size){
        var j = 2

        while (i*j<arr.size){
            if(arr[i*j]){
                arr[i*j] = false
            }
            ++j
        }
    }

    while (true){
        var a = nextInt()

        if(a == 0){
            break
        }

        var left = 3
        var right = a - 3

        while (left<=right){
            if(arr[left] && arr[right] && right%2 !=0){
                sb.append("${a} = ${left} + ${right}\n")
                break
            }
            left += 2
            right -= 2

            if(left>right){
                sb.append("Goldbach's conjecture is wrong.\n")
            }
        }
    }

    print(sb.toString())


}