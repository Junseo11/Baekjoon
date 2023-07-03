package baek.BaekjoonKotlin


fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine().split(" ").map {
        it.toInt()
    }
    val arr = IntArray(N + 1) {
        it
    }
    repeat(M) {
        var (i, j) = readLine().split(" ").map {
            it.toInt()
        }
        while(i < j) {
            val v = arr[i]
            arr[i++] = arr[j]
            arr[j--] = v
        }
    }

    for(i in 1..arr.size-1){
        print("${arr[i]} ")
    }
}


