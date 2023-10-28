import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var n = next()
    var sb = StringBuilder()
    if(n.length%3 == 1){
        n = "00" + n
    }
    if(n.length%3 == 2){
        n = "0" + n
    }

    for(i in 0 until n.length step 3){
        var sum = (n[i]-'0')*4  +(n[i+1]-'0')*2 + (n[i+2]-'0')*1
        sb.append(sum)
    }

    println(sb.toString())
}