package baek.BaekjoonKotlin


fun main() = with(System.`in`.bufferedReader()){

    val str = readLine()

    val arr = arrayOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")

    var res = 0

    for(i in str.indices){
        for(j in arr){
            if(j.contains(str[i])){
                res+=arr.indexOf(j)+3
            }
        }
    }

    print(res)
}