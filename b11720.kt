package baek.BaekjoonKotlin

fun main()= with(System.`in`.bufferedReader()){

    val n = readLine()

    var sum = 0

    var x = readLine()

    for(i in 0 until x.length){
        var r:Int = x[i]-'0'
        sum += r
    }

    print(sum)

}