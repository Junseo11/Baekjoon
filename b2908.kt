package baek.BaekjoonKotlin

fun main() = with(System.`in`.bufferedReader()){

    var (a,b) = readLine().split(" ")

    var ra = a.reversed().toInt()
    var rb = b.reversed().toInt()

    var res = if(ra>rb){
        ra
    }
    else{
        rb
    }

    print(res)



}