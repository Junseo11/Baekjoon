package baek.BaekjoonKotlin


fun main()= with(System.`in`.bufferedReader()){

    var n = readLine()

    for(i in 1..n.toInt()){
        var str = readLine()

        println("${str[0]}${str[str.length-1]}")
    }
}
